package td2.dao;

import java.util.ArrayList;

import td2.metier.Periodicite;


public interface DAOPeriodicite extends DAO<Periodicite>{

	ArrayList<Periodicite> findAll();

}