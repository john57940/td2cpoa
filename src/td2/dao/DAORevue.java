package td2.dao;

import java.util.ArrayList;

import td2.metier.Revue;

public interface DAORevue extends DAO<Revue> {
	ArrayList<Revue> findAll();
}
