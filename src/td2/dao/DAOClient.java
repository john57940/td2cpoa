package td2.dao;

import java.util.ArrayList;

import td2.PojoClient;

public interface DAOClient extends DAO<PojoClient>{
	
	ArrayList<PojoClient> findAll();
	
}
