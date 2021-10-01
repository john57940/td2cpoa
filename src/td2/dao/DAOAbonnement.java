package td2.dao;

import java.util.ArrayList;

import td2.PojoAbonnement;

public interface DAOAbonnement extends DAO<PojoAbonnement>{
	ArrayList<PojoAbonnement> findAll1();
}
