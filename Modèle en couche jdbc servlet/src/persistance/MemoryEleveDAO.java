package persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import model.Eleve;

public class MemoryEleveDAO implements EleveDAO {

	@Override
	public void save(Eleve eleve) {
		// Information d'accès à la base de données
		String url = "jdbc:mysql://localhost/ecole";
		String login = "root";
		String passwwd = "";
		Connection cn = null;
		Statement st = null;

		try {
			// 1: chargement du driver
			Class.forName("com.mysql.jdbc.Driver");

			// 2:récupérere la connexion
			cn = DriverManager.getConnection(url, login, passwwd);

			// 3:création du statement
			st = cn.createStatement();
			String sql = "INSERT INTO `eleves` (`name`) VALUES ('" + eleve + "')";

			// 4: execution requête
			st.executeUpdate(sql);

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		finally {
			try {
				// 5: libérer ressource de la mémoire
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
	

}
