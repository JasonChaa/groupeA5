package be.helha.aemt.groupeA5.dao;

import be.helha.aemt.groupeA5.entities.Visiteur;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class VisiteurDAO
{
	@PersistenceContext(unitName= "groupeA5")
	private EntityManager em;
	
	//ADD
	public Visiteur add(Visiteur v) {
		if(v == null || v.getEmail() == null) {return null;}
		return em.merge(v);
	}
}
