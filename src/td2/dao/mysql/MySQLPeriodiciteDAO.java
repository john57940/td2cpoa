package td2.dao.mysql;

import java.util.ArrayList;

import td2.dao.DAOPeriodicite;
import td2.metier.Periodicite;

public class MySQLPeriodiciteDAO implements DAOPeriodicite {
	private static MySQLPeriodiciteDAO instance;

	public static MySQLPeriodiciteDAO getInstance() {
		if (instance == null) {
			instance = new MySQLPeriodiciteDAO();
		}
		return instance;
	}

	@Override
	public Periodicite getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(Periodicite objet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Periodicite objet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Periodicite objet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Periodicite> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
