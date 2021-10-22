package td2.dao.mysql;

import td2.metier.Revue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import td2.dao.DAORevue;

public class MySQLRevueDAO implements DAORevue {

	public static DAORevue Instance;

	private MySQLRevueDAO() {
	}

	public static DAORevue getInstance() {

		if (Instance == null) {
			Instance = new MySQLRevueDAO();
		}
		return Instance;

	}

	@Override
	public Revue getById(int id_revue) throws Exception {
		Revue R = null;
		{
			Connection laConnexion = Connexion.creeConnexion();
			PreparedStatement requete = laConnexion.prepareStatement("select * from Revue where id=?");
			requete.setInt(1, id_revue);
			ResultSet res = requete.executeQuery();
			if (res.next()) {
				R = new Revue(res.getInt(id_revue), res.getInt(1), res.getString("titre"), res.getString("description"),
						res.getFloat(5), res.getString("visuel"));
			}
		}
		return R;

	}

	@Override
	public boolean create(Revue objet) throws Exception {
		Connection laConnexion = Connexion.creeConnexion();
		PreparedStatement req = laConnexion.prepareStatement(
				"insert into Revue(id_revue,id_periodicite,titre,description,tarif_numero,visuel) values(?,?,?,?,?,?)",
				Statement.RETURN_GENERATED_KEYS);

		req.setInt(1, objet.getId_revue());
		int res = req.executeUpdate();
		ResultSet re = req.getGeneratedKeys();
		if (re.next()) {
			objet.setId_revue(re.getInt(1));
		}
		return res == 1;
	}

	@Override
	public boolean update(Revue objet) throws Exception {
		Connection laConnexion = Connexion.creeConnexion();
		PreparedStatement req = laConnexion.prepareStatement(
				"Update Revue set id_revue=?, id_periodicite=?, titre=?, description=?, tarif_numero=?, visuel=?");
		req.setInt(1, objet.getId_revue());
		int res = req.executeUpdate();
		ResultSet re = req.getGeneratedKeys();
		if (re.next()) {
			objet.setId_periodicite(re.getInt(1));
		}
		return res == 1;

	}

	@Override
	public boolean delete(Revue objet) throws Exception {
		Connection laConnexion = Connexion.creeConnexion();
		PreparedStatement req = laConnexion.prepareStatement("Delete from Revue where id_revue");
		req.setInt(1, objet.getId_revue());
		int res = req.executeUpdate();
		ResultSet re = req.getGeneratedKeys();
		if (re.next()) {
			objet.setId_revue(re.getInt(1));
		}
		return res == 1;

	}

	@Override
	public ArrayList<Revue> findAll() {

		return null;
	}
}
