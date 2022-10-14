package Keune.Action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Gk_Database_Connection_Demo 
{
	
	public static Statement cacluate() throws ClassNotFoundException, SQLException {

		
			String dbUrl = "jdbc:mysql://localhost:3306/gkhair";
		
		//Database Username		
			String username = "sourabh";	
	    
		//Database Password		
			String password = "sourabh";				

		//Query to Execute		
			String query = "SELECT * from gk_users;";
		
		    Class.forName("com.mysql.jdbc.Driver");			

		    Connection con = DriverManager.getConnection(dbUrl,username,password);
		 
		    Statement stmt = con.createStatement();
	   
		    ResultSet rs= stmt.executeQuery(query);						

			return stmt;

		}

	


}
