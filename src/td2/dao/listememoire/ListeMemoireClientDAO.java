package td2.dao.listememoire;

import java.util.ArrayList;

import java.util.List;

import td2.dao.DAOClient;
import td2.metier.Client;

public class ListeMemoireClientDAO implements DAOClient {

	private static ListeMemoireClientDAO instance;

	private List<Client> donnees;

	public static ListeMemoireClientDAO getInstance() {

		if (instance == null) {
			instance = new ListeMemoireClientDAO();
		}

		return instance;
	}

	private ListeMemoireClientDAO() {

		this.donnees = new ArrayList<Client>();

		this.donnees
				.add(new Client(1, "vernet", "jonathan", "6", "rue des eglantines", "57940", "thionville", "france"));
		this.donnees.add(new Client(2, "mccafe", "john", "92", "walking street", "92700", "new york", "etats unis"));
	}

	@Override
	public boolean create(Client objet) {
		objet.setId_client(3);
		// Ne fonctionne que si l'objet m�tier est bien fait...
		while (this.donnees.contains(objet)) {

			objet.setId_client(objet.getId_client() + 1);
		}
		boolean ok = this.donnees.add(objet);

		return ok;
	}

	@Override
	public boolean update(Client objet) {

		// Ne fonctionne que si l'objet m�tier est bien fait...
		int idx = this.donnees.indexOf(objet);
		if (idx == -1) {
			throw new IllegalArgumentException("Tentative de modification d'un objet inexistant");
		} else {

			this.donnees.set(idx, objet);
		}

		return true;
	}

	@Override
	public boolean delete(Client objet) {

		Client supprime;

		// Ne fonctionne que si l'objet m�tier est bien fait...
		int idx = this.donnees.indexOf(objet);
		if (idx == -1) {
			throw new IllegalArgumentException("Tentative de suppression d'un objet inexistant");
		} else {
			supprime = this.donnees.remove(idx);
		}

		return objet.equals(supprime);
	}

	@Override
	public Client getById(int id) {
		// Ne fonctionne que si l'objet m�tier est bien fait...
		int idx = this.donnees.indexOf(new Client(id, "test", "test", "test", "test", "test", "test", "test"));
		if (idx == -1) {
			throw new IllegalArgumentException("Aucun objet ne poss�de cet identifiant");
		} else {
			return this.donnees.get(idx);
		}
	}

	@Override
	public ArrayList<Client> findAll() {
		return (ArrayList<Client>) this.donnees;
	}
}
