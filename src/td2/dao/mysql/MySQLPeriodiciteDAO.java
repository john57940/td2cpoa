package td2.dao.mysql;

import td2.metier.Periodicite;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import td2.dao.DAOPeriodicite;

public class MySQLPeriodiciteDAO implements DAOPeriodicite {

	public static DAOPeriodicite Instance;

	private MySQLPeriodiciteDAO() {
	}

	public static DAOPeriodicite getInstance() {

		if (Instance == null) {
			Instance = new MySQLPeriodiciteDAO();
		}
		return Instance;

	}

	@Override
	public Periodicite getById(int id_periodicite) throws Exception {
		Periodicite P = null;
		{
			Connection laConnexion = Connexion.creeConnexion();
			PreparedStatement requete = laConnexion.prepareStatement("select * from Periodicite where id=?");
			requete.setInt(1, id_periodicite);
			ResultSet res = requete.executeQuery();
			if (res.next()) {
				P = new Periodicite(res.getInt(id_periodicite), res.getString("libelle"));
			}
		}
		return P;

	}

	@Override
	public boolean create(Periodicite objet) throws Exception {
		Connection laConnexion = Connexion.creeConnexion();
		PreparedStatement req = laConnexion.prepareStatement(
				"insert into Periodicite(id_periodicite,libelle) values(?,?)", Statement.RETURN_GENERATED_KEYS);

		req.setInt(1, objet.getId_periodicite());
		int res = req.executeUpdate();
		ResultSet re = req.getGeneratedKeys();
		if (re.next()) {
			objet.setId_periodicite(re.getInt(1));
		}
		return res == 1;
	}

	@Override
	public boolean update(Periodicite objet) throws Exception {
		Connection laConnexion = Connexion.creeConnexion();
		PreparedStatement req = laConnexion.prepareStatement("Update Periodicite set id_periodicite=?, libelle=?");
		req.setInt(1, objet.getId_periodicite());
		int res = req.executeUpdate();
		ResultSet re = req.getGeneratedKeys();
		if (re.next()) {
			objet.setId_periodicite(re.getInt(1));
		}
		return res == 1;

	}

	@Override
	public boolean delete(Periodicite objet) throws Exception {
		Connection laConnexion = Connexion.creeConnexion();
		PreparedStatement req = laConnexion.prepareStatement("Delete from Periodicite where id_periodicite");
		req.setInt(1, objet.getId_periodicite());
		int res = req.executeUpdate();
		ResultSet re = req.getGeneratedKeys();
		if (re.next()) {
			objet.setId_periodicite(re.getInt(1));
		}
		return res == 1;

	}

	@Override
	public ArrayList<Periodicite> findAll() {

		return null;
	}
}
