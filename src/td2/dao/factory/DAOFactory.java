package td2.dao.factory;

import td2.dao.DAOAbonnement;

import td2.dao.DAOClient;
import td2.dao.DAOPeriodicite;
import td2.dao.DAORevue;

public abstract class DAOFactory {
	public static DAOFactory getDAOFactory(Persistance cible) {
		DAOFactory daoF = null;

		switch (cible) {
		case MYSQL:
			daoF = new MySQLDAOFactory();
			break;
		case ListeMemoireDAO:
			daoF = new ListeMemoireFactoryDAO();
			break;
		default:
			break;
		}

		return daoF;

	}

	public abstract DAOAbonnement getDAOAbonnement();

	public abstract DAOClient getDAOClient();

	public abstract DAOPeriodicite getDAOPeriodicite();

	public abstract DAORevue getDAORevue();

	public Object getPeriodiciteDAO() {
		return null;
	}

	public Object getRevueDAO() {
		return null;
	}
}