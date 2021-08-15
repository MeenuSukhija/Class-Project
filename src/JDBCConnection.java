
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class JDBCConnection {
	public final static String url = "jdbc:mysql://localhost:3306/amazonproduct";
	public final static String username = "root";
	public final static String password = "Meenu@77";

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}
}
