package org.tse.de3.el.restapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Team {

	private @Id
	@GeneratedValue
	Long id;

	private String NomEquipe;

	private String Ville;

	public Team() {
	}

	Team(String NomEquipe, String Ville) {
		this.NomEquipe = NomEquipe;
		this.Ville = Ville;
	}
}
