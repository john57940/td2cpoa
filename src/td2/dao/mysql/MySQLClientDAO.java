package td2.dao.mysql;

import java.util.ArrayList;

import td2.PojoClient;
import td2.dao.DAOClient;

public class MySQLClientDAO implements DAOClient {
	private static MySQLClientDAO instance;
    public static MySQLClientDAO getInstance() {
    	if(instance == null) {
    		instance = new MySQLClientDAO();
    	}
    	return instance;
    }

	@Override
	public PojoClient getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(PojoClient objet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(PojoClient objet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(PojoClient objet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<PojoClient> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
