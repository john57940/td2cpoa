package td2.dao.mysql;

import java.util.ArrayList;

import td2.dao.DAOClient;
import td2.metier.Client;

public class MySQLClientDAO implements DAOClient {
	private static MySQLClientDAO instance;
    public static MySQLClientDAO getInstance() {
    	if(instance == null) {
    		instance = new MySQLClientDAO();
    	}
    	return instance;
    }

	@Override
	public Client getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(Client objet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Client objet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Client objet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Client> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
