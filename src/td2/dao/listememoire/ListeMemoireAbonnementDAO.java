package td2.dao.listememoire;

import java.util.ArrayList;
import java.util.List;

import td2.dao.DAOAbonnement;
import td2.PojoAbonnement;

public class ListeMemoireAbonnementDAO implements DAOAbonnement {

	private static ListeMemoireAbonnementDAO instance;

	private List<PojoAbonnement> donnees;


	public static ListeMemoireAbonnementDAO getInstance() {

		if (instance == null) {
			instance = new ListeMemoireAbonnementDAO();
		}

		return instance;
	}

	private ListeMemoireAbonnementDAO() {

		this.donnees = new ArrayList<PojoAbonnement>();

		//this.donnees.add(new PojoAbonnement(1, 1, 1, ));
		//this.donnees.add(new PojoAbonnement(2, 2, 2, )); a corriger
	}


	@Override
	public boolean create(PojoAbonnement objet) {

		objet.setId_abonnement(3);
		// Ne fonctionne que si l'objet métier est bien fait...
		while (this.donnees.contains(objet)) {

			objet.setId_abonnement(objet.getId_abonnement() + 1);
		}
		boolean ok = this.donnees.add(objet);
		
		return ok;
	}

	@Override
	public boolean update(PojoAbonnement objet) {
		
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
	public boolean delete(PojoAbonnement objet) {

		PojoAbonnement supprime;
		
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
	public PojoAbonnement getById(int id) {
		// Ne fonctionne que si l'objet métier est bien fait...
		//int idx = this.donnees.indexOf(new PojoAbonnement(id, )); a completer
		//if (idx == -1) {
			throw new IllegalArgumentException("Aucun objet ne possède cet identifiant");
		//} else {
		//	return this.donnees.get(idx);
		}
	//}
	@Override
	public ArrayList<PojoAbonnement> findAll() {
		return (ArrayList<PojoAbonnement>) this.donnees;
	}
}

