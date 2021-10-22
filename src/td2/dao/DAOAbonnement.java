package td2.dao;

import java.util.ArrayList;

import td2.metier.Abonnement;

public interface DAOAbonnement extends DAO<Abonnement>{
	ArrayList<Abonnement> findAll();
}
