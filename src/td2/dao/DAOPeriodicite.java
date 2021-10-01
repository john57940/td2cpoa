package td2.dao;

import java.util.ArrayList;

import td2.PojoPerio;

public interface DAOPeriodicite extends DAO<PojoPerio>{

	ArrayList<PojoPerio> findAll();

}