package td2.dao.factory;

import td2.dao.DAOAbonnement;
import td2.dao.DAOClient;
import td2.dao.DAOPeriodicite;
import td2.dao.DAORevue;
import td2.dao.listememoire.ListeMemoireAbonnementDAO;
import td2.dao.listememoire.ListeMemoireClientDAO;
import td2.dao.listememoire.ListeMemoirePeriodiciteDAO;
import td2.dao.listememoire.ListeMemoireRevueDAO;

public class ListeMemoireFactoryDAO extends DAOFactory {

	@Override
	public DAOAbonnement getDAOAbonnement() {

		return ListeMemoireAbonnementDAO.getInstance();

	}

	@Override
	public DAOClient getDAOClient() {

		return ListeMemoireClientDAO.getInstance();

	}

	@Override
	public DAOPeriodicite getDAOPeriodicite() {

		return ListeMemoirePeriodiciteDAO.getInstance();

	}

	@Override
	public DAORevue getDAORevue() {

		return ListeMemoireRevueDAO.getInstance();

	}
}
