package td2.dao.mysql;

import java.util.ArrayList;

import td2.dao.DAORevue;
import td2.metier.Revue;

public class MySQLRevueDAO implements DAORevue {
	private static MySQLRevueDAO instance;

	public static MySQLRevueDAO getInstance() {
		if (instance == null) {
			instance = new MySQLRevueDAO();
		}
		return instance;
	}

	@Override
	public Revue getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(Revue objet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Revue objet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Revue objet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Revue> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
