package jdbcfinalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Finalprojectjdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");
		
		String dburl = "jdbc:mysql://localhost:3306/myproduct";
		String username = "root";
		String password = "root";
		String query = "Call myproduct()";
		Connection con = null;
		

		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		con = DriverManager.getConnection(dburl,username,password);
			Statement stmt = con.createStatement(); // execute query
			ResultSet rs = stmt.executeQuery(query); 
			// see the result
		
			while(rs.next()) {
				
				System.out.print("product_id: " + rs.getString("product_id") + "\t");
				System.out.print("product_name: " + rs.getString("product_name") + "\t");
				System.out.print("quantity: " + rs.getString("quantity") + "\t");
				System.out.println("price: " + rs.getString("price"));
			}

		}
			
			catch(Exception e) {
				System.out.println(e.getMessage());
			
			}
			finally {
				con.close();
			}
		
		

	}

}
