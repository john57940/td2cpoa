package td2.dao.mysql;

import td2.metier.Abonnement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import td2.dao.DAOAbonnement;

public class MySQLAbonnementDAO implements DAOAbonnement {

	public static DAOAbonnement Instance;

	private MySQLAbonnementDAO() {
	}

	public static DAOAbonnement getInstance() {

		if (Instance == null) {
			Instance = new MySQLAbonnementDAO();
		}
		return Instance;

	}

	@Override
	public Abonnement getById(int id_abonnement) throws Exception {
		Abonnement abo = null;
		{
			Connection laConnexion = Connexion.creeConnexion();
			PreparedStatement requete = laConnexion.prepareStatement("select * from Abonnement where id=?");
			requete.setInt(1, id_abonnement);
			ResultSet res = requete.executeQuery();
			if (res.next()) {
				abo = new Abonnement(res.getInt(1), res.getInt(1), res.getInt(id_abonnement), null, null);
			}
		}
		return abo;

	}

	@Override
	public boolean create(Abonnement objet) throws Exception {
		// TODO Auto-generated method stub
		Connection laConnexion = Connexion.creeConnexion();
		PreparedStatement req = laConnexion.prepareStatement(
				"insert into Abonnement(id_abo,date_debut,date_fin,id_client,id_revue) values(?,?,?,?,?)",
				Statement.RETURN_GENERATED_KEYS);

		req.setInt(1, objet.getId_abonnement());

		req.setDate(4, (Date) objet.getDate_debut());
		req.setDate(5, (Date) objet.getDate_fin());
		int res = req.executeUpdate();
		ResultSet re = req.getGeneratedKeys();
		if (re.next()) {
			objet.setId_abonnement(re.getInt(1));
			objet.setDate_debut(re.getDate(4));
			objet.setDate_debut(re.getDate(5));

		}
		return res == 1;
	}

	@Override
	public boolean update(Abonnement objet) throws Exception {
		// TODO Auto-generated method stub
		Connection laConnexion = Connexion.creeConnexion();
		PreparedStatement req = laConnexion.prepareStatement(
				"Update Abonnement set id_abo=?, date_deb=?, date_fin=?, id_client=?, id_revue=? where id_abo=?");
		req.setInt(1, objet.getId_abonnement());
		req.setDate(4, (Date) objet.getDate_debut());
		req.setDate(5, (Date) objet.getDate_fin());
		int res = req.executeUpdate();
		ResultSet re = req.getGeneratedKeys();
		if (re.next()) {
			objet.setId_abonnement(re.getInt(1));
			objet.setDate_debut(re.getDate(4));
			objet.setDate_debut(re.getDate(5));
		}
		return res == 1;

	}

	@Override
	public boolean delete(Abonnement objet) throws Exception {
		// TODO Auto-generated method stub
		Connection laConnexion = Connexion.creeConnexion();
		PreparedStatement req = laConnexion.prepareStatement("Delete from Abonnement where id_abo");
		req.setInt(1, objet.getId_abonnement());
		int res = req.executeUpdate();
		ResultSet re = req.getGeneratedKeys();
		if (re.next()) {
			objet.setId_abonnement(re.getInt(1));
		}
		return res == 1;

	}

	@Override
	public ArrayList<Abonnement> findAll() {

		return null;
	}
}
