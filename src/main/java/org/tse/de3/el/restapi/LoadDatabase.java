package org.tse.de3.el.restapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;


@Configuration
@Slf4j
public class LoadDatabase {

	@Bean
	CommandLineRunner initDatabase(TeamRepository repository, PlayerRepository repo) {
		return args -> {
			
			log.info("Preloading " + repository.save(new Team("OM", "Marseille")));
			
			log.info("Preloading " + repository.save(new Team("ASSE", "Saint Etienne")));

			log.info("Preloading " + repo.save(new Player("Riyad", "Mahrez")));

			log.info("Preloading " + repo.save(new Player("Dimitri", "Payet")));
		};
	}
}
