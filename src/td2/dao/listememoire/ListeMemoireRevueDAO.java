package td2.dao.listememoire;
import java.util.ArrayList;
import java.util.List;

import td2.dao.DAORevue;
import td2.PojoRevue;

public class ListeMemoireRevueDAO implements DAORevue {

	private static ListeMemoireRevueDAO instance;

	private List<PojoRevue> donnees;


	public static ListeMemoireRevueDAO getInstance() {

		if (instance == null) {
			instance = new ListeMemoireRevueDAO();
		}

		return instance;
	}

	private ListeMemoireRevueDAO() {

		this.donnees = new ArrayList<PojoRevue>();

		this.donnees.add(new PojoRevue(1, 1, "Bernard en foret", "Bernard se balade en foret", 5.99f,"image"));
		this.donnees.add(new PojoRevue(2, 2, "Marine en foret", "Marine se balade en foret", 5.50f,"texte"));
	}


	@Override
	public boolean create(PojoRevue objet) {

		objet.setId_revue(3);
		// Ne fonctionne que si l'objet métier est bien fait...
		while (this.donnees.contains(objet)) {

			objet.setId_revue(objet.getId_revue() + 1);
		}
		boolean ok = this.donnees.add(objet);
		
		return ok;
	}

	@Override
	public boolean update(PojoRevue objet) {
		
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
	public boolean delete(PojoRevue objet) {

		PojoRevue supprime;
		
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
	public PojoRevue getById(int id) {
		// Ne fonctionne que si l'objet métier est bien fait...
		int idx = this.donnees.indexOf(new PojoRevue(id, 3, "test", "test", 5.99f, "test"));
		if (idx == -1) {
			throw new IllegalArgumentException("Aucun objet ne possède cet identifiant");
		} else {
			return this.donnees.get(idx);
		}
	}
	@Override
	public ArrayList<PojoRevue> findAll() {
		return (ArrayList<PojoRevue>) this.donnees;
	}
}