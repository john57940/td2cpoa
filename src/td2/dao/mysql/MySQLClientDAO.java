package td2.dao.mysql;

import td2.metier.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import td2.dao.DAOClient;

public class MySQLClientDAO implements DAOClient {

	public static DAOClient Instance;

	private MySQLClientDAO() {
	}

	public static DAOClient getInstance() {

		if (Instance == null) {
			Instance = new MySQLClientDAO();
		}
		return Instance;

	}

	@Override
	public Client getById(int id_client) throws Exception {
		Client cl = null;
		{
			Connection laConnexion = Connexion.creeConnexion();
			PreparedStatement requete = laConnexion.prepareStatement("select * from Client where id=?");
			requete.setInt(1, id_client);
			ResultSet res = requete.executeQuery();
			if (res.next()) {
				cl = new Client(res.getInt(id_client), res.getString("nom"), res.getString("prenom"),
						res.getString("no_rue"), res.getString("voie"), res.getString("code_postal"),
						res.getString("ville"), res.getString("pays"));
			}
		}
		return cl;

	}

	@Override
	public boolean create(Client objet) throws Exception {
		Connection laConnexion = Connexion.creeConnexion();
		PreparedStatement req = laConnexion.prepareStatement(
				"insert into Client(id_client,nom,prenom,no_rue,voie,code_postal,ville,pays) values(?,?,?,?,?,?,?,?)",
				Statement.RETURN_GENERATED_KEYS);

		req.setInt(1, objet.getId_client());
		int res = req.executeUpdate();
		ResultSet re = req.getGeneratedKeys();
		if (re.next()) {
			objet.setId_client(re.getInt(1));
		}
		return res == 1;
	}

	@Override
	public boolean update(Client objet) throws Exception {
		Connection laConnexion = Connexion.creeConnexion();
		PreparedStatement req = laConnexion.prepareStatement(
				"Update Client set id_client=?, nom=?, prenom=?, no_rue=?, voie=?, code_postal=?, ville=?, pays=?, where id_client=?");
		req.setInt(1, objet.getId_client());
		int res = req.executeUpdate();
		ResultSet re = req.getGeneratedKeys();
		if (re.next()) {
			objet.setId_client(re.getInt(1));
		}
		return res == 1;

	}

	@Override
	public boolean delete(Client objet) throws Exception {
		Connection laConnexion = Connexion.creeConnexion();
		PreparedStatement req = laConnexion.prepareStatement("Delete from Client where id_client");
		req.setInt(1, objet.getId_client());
		int res = req.executeUpdate();
		ResultSet re = req.getGeneratedKeys();
		if (re.next()) {
			objet.setId_client(re.getInt(1));
		}
		return res == 1;

	}

	@Override
	public ArrayList<Client> findAll() {

		return null;
	}
}
