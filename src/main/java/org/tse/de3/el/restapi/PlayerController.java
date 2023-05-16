package org.tse.de3.el.restapi;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

	private final PlayerRepository repository;

  
	PlayerController(PlayerRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/players")
	List<Player> all() {
		return repository.findAll();
	}
	
	@PostMapping("/players")
	Player newPlayer(@RequestBody Player newPlayer) {
	    return repository.save(newPlayer);
	}
	
	@GetMapping("/players/{id}")
	Optional<Player> one(@PathVariable Long id) {

		return repository.findById(id);
	}
	
	@DeleteMapping("/players/{id}")
	void deletePlayer(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	@PutMapping("/players/{id}")
	Optional<Player> replacePlayer(@RequestBody Player newPlayer, @PathVariable Long id) {

		return repository.findById(id)
	      .map(player -> {
	        player.setNom(newPlayer.getNom());
	        player.setPrenom(newPlayer.getPrenom());
	        return repository.save(player);
	      });
	}
}
