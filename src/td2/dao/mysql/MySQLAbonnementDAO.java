package td2.dao.mysql;

import java.util.ArrayList;

import td2.dao.DAOAbonnement;
import td2.metier.Abonnement;

public class MySQLAbonnementDAO implements DAOAbonnement {
	private static MySQLAbonnementDAO instance;

	public static MySQLAbonnementDAO getInstance() {
		if (instance == null) {
			instance = new MySQLAbonnementDAO();
		}
		return instance;
	}

	@Override
	public Abonnement getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(Abonnement objet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Abonnement objet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Abonnement objet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Abonnement> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
