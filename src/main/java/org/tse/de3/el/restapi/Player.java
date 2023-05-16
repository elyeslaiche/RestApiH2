package org.tse.de3.el.restapi;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Player {

	private @Id
	@GeneratedValue
	Long id;
  
	private String Nom;
  
	private String Prenom;
  
	public Player() {
	}

	Player(String Nom, String Prenom) {
		this.Nom = Nom;
		this.Prenom = Prenom;
	}
}
