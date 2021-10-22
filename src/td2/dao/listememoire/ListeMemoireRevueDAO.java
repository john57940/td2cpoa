package td2.dao.listememoire;

import java.util.ArrayList;

import java.util.List;

import td2.dao.DAORevue;
import td2.metier.Revue;

public class ListeMemoireRevueDAO implements DAORevue {

	private static ListeMemoireRevueDAO instance;

	private List<Revue> donnees;

	public static ListeMemoireRevueDAO getInstance() {

		if (instance == null) {
			instance = new ListeMemoireRevueDAO();
		}

		return instance;
	}

	private ListeMemoireRevueDAO() {

		this.donnees = new ArrayList<Revue>();

		this.donnees.add(new Revue(1, 1, "Bernard en foret", "Bernard se balade en foret", 5.99f, "image"));
		this.donnees.add(new Revue(2, 2, "Marine en foret", "Marine se balade en foret", 5.50f, "texte"));
	}

	@Override
	public boolean create(Revue objet) {

		objet.setId_revue(3);
		// Ne fonctionne que si l'objet métier est bien fait...
		while (this.donnees.contains(objet)) {

			objet.setId_revue(objet.getId_revue() + 1);
		}
		boolean ok = this.donnees.add(objet);

		return ok;
	}

	@Override
	public boolean update(Revue objet) {

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
	public boolean delete(Revue objet) {

		Revue supprime;

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
	public Revue getById(int id) {
		// Ne fonctionne que si l'objet métier est bien fait...
		int idx = this.donnees.indexOf(new Revue(id, 3, "test", "test", 5.99f, "test"));
		if (idx == -1) {
			throw new IllegalArgumentException("Aucun objet ne possède cet identifiant");
		} else {
			return this.donnees.get(idx);
		}
	}

	@Override
	public ArrayList<Revue> findAll() {
		return (ArrayList<Revue>) this.donnees;
	}
}