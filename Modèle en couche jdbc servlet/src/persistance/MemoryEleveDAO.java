package persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import model.Eleve;

public class MemoryEleveDAO implements EleveDAO {

	@Override
	public void save(Eleve eleve) {
		// Information d'acc�s � la base de donn�es
		String url = "jdbc:mysql://localhost/ecole";
		String login = "root";
		String passwwd = "";
		Connection cn = null;
		Statement st = null;

		try {
			// 1: chargement du driver
			Class.forName("com.mysql.jdbc.Driver");

			// 2:r�cup�rere la connexion
			cn = DriverManager.getConnection(url, login, passwwd);

			// 3:cr�ation du statement
			st = cn.createStatement();
			String sql = "INSERT INTO `eleves` (`name`) VALUES ('" + eleve + "')";

			// 4: execution requ�te
			st.executeUpdate(sql);

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		finally {
			try {
				// 5: lib�rer ressource de la m�moire
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
	

}
