package td2.dao;

import java.util.ArrayList;

import td2.PojoAbonnement;
import td2.PojoPerio;

public interface DAO<T> {
	public abstract T getById(int id);

	public abstract boolean create(T objet);

	public abstract boolean update(T objet);

	public abstract boolean delete(T objet);
	ArrayList<PojoPerio> findAll();
	ArrayList<PojoAbonnement> findAll1();
}
