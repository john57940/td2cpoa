package td2.dao.mysql;

import java.sql.*;

public class Connexion {

	public static Connection creeConnexion() {

		String url = "jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/vernet18u_java";
		String login = "vernet18u_appli";
		url += "?serverTimezone=Europe/Paris";
		String pwd = "sv10041004";
		Connection maConnexion = null;
		try {
			maConnexion = DriverManager.getConnection(url, login, pwd);
		} catch (SQLException sqle) {
			System.out.println("Erreur connexion" + sqle.getMessage());
		}
		return maConnexion;
	}

	public static void fermeture(Connexion laConnexion, PreparedStatement req, ResultSet res) throws SQLException {

		if (res != null)
			res.close();
		if (req != null)
			req.close();
		if (laConnexion != null)
			((java.sql.Connection) laConnexion).close();
	}

}
