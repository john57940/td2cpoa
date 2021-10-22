package td2.dao.mysql;

import java.sql.*;

public class Connection {

	public static Connection creeConnexion() {

			String url = "jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/vernet18u_java";
			String login = "vernet18u_appli";
			url += "?serverTimezone=Europe/Paris";
			String pwd = "sv10041004";
			Connection maConnexion = null;
			try {
				maConnexion = (Connection) DriverManager.getConnection(url, login, pwd);
			} catch (SQLException sqle) {
				System.out.println("Erreur connexion" + sqle.getMessage());
			}
			return maConnexion;
		}
	public void uneRequete() {
		try {
			Connection laConnexion = creeConnexion();
			Statement requete = ((java.sql.Connection) laConnexion).createStatement();
			ResultSet res = requete.executeQuery("select id_periodicite, libelle from Periodicite");
			while (res.next()) {
				int no = res.getInt(1);
				String nom = res.getString("libelle");
				System.out.println(no +" "+ nom);

			}
			if (res != null)
				res.close();
			if (requete != null)
				requete.close();
			if (laConnexion != null)
				((java.sql.Connection) laConnexion).close();
		} catch (SQLException sqle) {
			System.out.println("Pb select" + sqle.getMessage());

		}
	}

	public static void fermeture(Connection laConnexion, PreparedStatement req, ResultSet res) throws SQLException {
		
		if(res != null)
			res.close();
		if(req != null)
			req.close();
		if(laConnexion != null)
			((java.sql.Connection) laConnexion).close();
	}

}
