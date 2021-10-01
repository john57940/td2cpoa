package td2.dao;

import java.util.ArrayList;

import td2.PojoRevue;

public interface DAORevue extends DAO<PojoRevue>{
	ArrayList<PojoRevue> findAll();
}
