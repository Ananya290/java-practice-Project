package jdbcpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Transactiondemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		String query = "Call allmovies()";
		
		Connection con = DriverManager.getConnection(dburl,username,password);
		System.out.println("succesfully connected");

	}

}
