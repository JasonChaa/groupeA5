package be.helha.aemt.groupeA5.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Visiteur {

	//VARIABLES
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String email;

	//CONSTRUCTEUR
	public Visiteur(String email) { this.email = email; }
	
	//CONSTRUCTEUR VIDE
	public Visiteur() { this("la218812@student.helha.be"); }

	//GETTERS
	public Integer getId() { return id; }
	public String getEmail() { return email; }

	//SETTERS
	public void setId(Integer id) { this.id = id; }
	public void setEmail(String email) { this.email = email; }

	//TOSTRING
	@Override
	public String toString() { return "id:" + id + ", email:" + email; }
}
