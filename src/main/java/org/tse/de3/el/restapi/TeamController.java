package org.tse.de3.el.restapi;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TeamController {

	private final TeamRepository repository;

  
	TeamController(TeamRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/teams")
	List<Team> all() {
		return repository.findAll();
	}
	
	@PostMapping("/teams")
	Team newTeam(@RequestBody Team newTeam) {
	    return repository.save(newTeam);
	}
	
	@GetMapping("/teams/{id}")
	Optional<Team> one(@PathVariable Long id) {
		return repository.findById(id);
	}
	
	@DeleteMapping("/teams/{id}")
	void deleteTeam(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	@PutMapping("/teams/{id}")
	Optional<Team> replaceTeam(@RequestBody Team newTeam, @PathVariable Long id) {

		return repository.findById(id)
	      .map(team -> {
	        team.setVille(newTeam.getVille());
	        team.setNomEquipe(newTeam.getNomEquipe());
	        return repository.save(team);
	      });
	}
}
