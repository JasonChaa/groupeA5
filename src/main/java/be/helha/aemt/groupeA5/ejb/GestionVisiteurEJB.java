package be.helha.aemt.groupeA5.ejb;

import java.util.List;

import be.helha.aemt.groupeA5.dao.VisiteurDAO;
import be.helha.aemt.groupeA5.entities.Visiteur;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

@Stateless
public class GestionVisiteurEJB {
	@EJB
	private VisiteurDAO visDAO;
	
	public Visiteur add(Visiteur visiteur) { return visDAO.add(visiteur); }
}
