package jdbcpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Createdropdemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		
		String query1 = " create database demo_database";
		String query2 = "use demo_database";
		String query3 = "drop database demo_database";
		
		Connection con = DriverManager.getConnection(dburl,username,password);
		
		
		Statement stmt = con.createStatement();
		
    	//stmt.executeUpdate(query1);
		//System.out.println("database created");
		stmt.executeUpdate(query2);
		System.out.println("use database ");
		//stmt.executeUpdate(query3);
		//System.out.println("database deleted");
		
		con.close();
		
//		

	}
	    

}
