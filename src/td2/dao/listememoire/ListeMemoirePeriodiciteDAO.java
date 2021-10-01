package td2.dao.listememoire;

import java.util.ArrayList;
import java.util.List;

import td2.dao.DAOPeriodicite;
import td2.PojoPerio;

public class ListeMemoirePeriodiciteDAO implements DAOPeriodicite {

	private static ListeMemoirePeriodiciteDAO instance;

	private List<PojoPerio> donnees;


	public static ListeMemoirePeriodiciteDAO getInstance() {

		if (instance == null) {
			instance = new ListeMemoirePeriodiciteDAO();
		}

		return instance;
	}

	private ListeMemoirePeriodiciteDAO() {

		this.donnees = new ArrayList<PojoPerio>();

		this.donnees.add(new PojoPerio(1, "Mensuel"));
		this.donnees.add(new PojoPerio(2, "Quotidien"));
	}


	@Override
	public boolean create(PojoPerio objet) {

		objet.setId_periodicite(3);
		// Ne fonctionne que si l'objet métier est bien fait...
		while (this.donnees.contains(objet)) {

			objet.setId_periodicite(objet.getId_periodicite() + 1);
		}
		boolean ok = this.donnees.add(objet);
		
		return ok;
	}

	@Override
	public boolean update(PojoPerio objet) {
		
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
	public boolean delete(PojoPerio objet) {

		PojoPerio supprime;
		
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
	public PojoPerio getById(int id) {
		// Ne fonctionne que si l'objet métier est bien fait...
		int idx = this.donnees.indexOf(new PojoPerio(id, "test"));
		if (idx == -1) {
			throw new IllegalArgumentException("Aucun objet ne possède cet identifiant");
		} else {
			return this.donnees.get(idx);
		}
	}
	@Override
	public ArrayList<PojoPerio> findAll() {
		return (ArrayList<PojoPerio>) this.donnees;
	}
}

