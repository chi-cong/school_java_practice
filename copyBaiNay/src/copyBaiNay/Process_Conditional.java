package copyBaiNay;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Process_Conditional {
	public Connection getCon() {
		String url = "jdbc:mysql://localhost:3306/db_student";
		String userName = "root";
		String password = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection(url, userName, password);
			return cn;
		} catch ( ClassNotFoundException | SQLException e) {
			System.out.print(e);
		}
		return null;
	}
	
	public boolean insertStudent(String id, String name, String Company, int Year, double Price) {
		
		Connection conn = getCon();
		String command = "insert into tbConditional (ID, Name, Company, Year, Price)" + 
						 "value ('?', '?', '?', '?', '?')";
		try {
			PreparedStatement statement = conn.prepareStatement(command);
			statement.setString(1, id);
			statement.setString(2, name);
			statement.setString(3, Company);
			statement.setInt(4, Year);
			statement.setDouble(5, Price);
			int insertRow = statement.executeUpdate();
			return true;
		} catch ( SQLException e) {
			System.out.print(e);
		}
		return false;
	}
}
