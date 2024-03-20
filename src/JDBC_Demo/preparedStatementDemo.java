package JDBC_Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class preparedStatementDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/springjdbc?useSSL=false";
		 
	       String username = "root";
	       String password = "Rup#1904";

	        System.out.println("Connecting database...");

	        try  {
	                Connection connection = DriverManager.getConnection(url, username, password);
	                String q="insert into student values(?,?,?)";
	                PreparedStatement myst = connection.prepareStatement(q);
	                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	                int id =Integer.parseInt(br.readLine()); 
	                String name =br.readLine();
	                int age =Integer.parseInt(br.readLine()); 
	                
	                myst.setInt(1, id);
	                myst.setString(2, name);
	                myst.setInt(3,age);
	                
	                myst.executeUpdate();
	                System.out.println("row inserted");
	        } catch (SQLException e) {
	            throw new IllegalStateException("Cannot connect the database!", e);
	        }


	}

}
