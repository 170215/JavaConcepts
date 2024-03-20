package JDBC_Demo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class demo {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		//Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/springjdbc?useSSL=false";
		 
       String username = "root";
       String password = "Rup#1904";

        System.out.println("Connecting database...");

        try  {
                Connection connection = DriverManager.getConnection(url, username, password);
                Statement myst = connection.createStatement();
                ResultSet rt= myst.executeQuery("select *from student");
                while(rt.next()) {
                	System.out.print(rt.getInt(1)+"\t");
                	System.out.print(rt.getString(2)+"\t");
                	System.out.println(rt.getInt(3)+"\t");
                }
                
                if(connection != null) {
                        System.out.println("Database connected!");
                }
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }

	}

}
