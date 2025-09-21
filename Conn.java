package bank.management.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
public class Conn {
	Connection connection;
	Statement statement;
	public Conn() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root", "pass123");
			statement = connection.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
