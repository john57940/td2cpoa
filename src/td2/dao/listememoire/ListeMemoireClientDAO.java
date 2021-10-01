package td2.dao.listememoire;

import java.util.ArrayList;
import java.util.List;

import td2.dao.DAOClient;
import td2.PojoClient;

public class ListeMemoireClientDAO implements DAOClient {

	private static ListeMemoireClientDAO instance;

	private List<PojoClient> donnees;


	public static ListeMemoireClientDAO getInstance() {

		if (instance == null) {
			instance = new ListeMemoireClientDAO();
		}

		return instance;
	}

	private ListeMemoireClientDAO() {

		this.donnees = new ArrayList<PojoClient>();

		this.donnees.add(new PojoClient(1, "vernet", "jonathan", "6", "rue des eglantines","57940","thionville","france" ));
		this.donnees.add(new PojoClient(2, "mccafe", "john","92","walking street","92700","new york","etats unis"));
	}


	@Override
	public boolean create(PojoClient objet) {

		objet.setId_client(3);
		// Ne fonctionne que si l'objet métier est bien fait...
		while (this.donnees.contains(objet)) {

			objet.setId_client(objet.getId_client() + 1);
		}
		boolean ok = this.donnees.add(objet);
		
		return ok;
	}

	@Override
	public boolean update(PojoClient objet) {
		
		// Ne fonctionne que si l'objet métier est bien fait...
		int idx = this.donnees.indexOf(objet);
		if (idx == -1) {
			throw new IllegalArgumentException("Tentative de modification d'un objet inexistant");
		} else {
			
			this.donnees.set(idx, objet);
		}
		
		return true;
	}

	@Override
	public boolean delete(PojoClient objet) {

		PojoClient supprime;
		
		// Ne fonctionne que si l'objet métier est bien fait...
		int idx = this.donnees.indexOf(objet);
		if (idx == -1) {
			throw new IllegalArgumentException("Tentative de suppression d'un objet inexistant");
		} else {
			supprime = this.donnees.remove(idx);
		}
		
		return objet.equals(supprime);
	}

	@Override
	public PojoClient getById(int id) {
		// Ne fonctionne que si l'objet métier est bien fait...
		int idx = this.donnees.indexOf(new PojoClient(id, "test", "test", "test", "test", "test", "test", "test"));
		if (idx == -1) {
			throw new IllegalArgumentException("Aucun objet ne possède cet identifiant");
		} else {
			return this.donnees.get(idx);
		}
	}
	@Override
	public ArrayList<PojoClient> findAll() {
		return (ArrayList<PojoClient>) this.donnees;
	}
}


