package td2.dao.mysql;

import java.util.ArrayList;
import td2.PojoPerio;
import td2.dao.DAOPeriodicite;

public class MySQLPeriodiciteDAO implements DAOPeriodicite {
	private static MySQLPeriodiciteDAO instance;
    public static MySQLPeriodiciteDAO getInstance() {
    	if(instance == null) {
    		instance = new MySQLPeriodiciteDAO();
    	}
    	return instance;
    }

	@Override
	public PojoPerio getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(PojoPerio objet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(PojoPerio objet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(PojoPerio objet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<PojoPerio> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
