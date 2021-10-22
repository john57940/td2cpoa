package td2.dao;

import java.util.ArrayList;
import td2.metier.Client;

public interface DAOClient extends DAO<Client>{
	
	ArrayList<Client> findAll();
	
}
