package JDBC_Demo.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class HandsOn4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		Scanner s= new Scanner(System.in);
		
		Class.forName("oracle.jdbc.driver.OracleDriver");//type of  driver and database name
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mayuri","mayuri");
		
		String s1 = "{call book_501(?)}";
		CallableStatement cst = con.prepareCall(s1);
		cst.registerOutParameter(1, java.sql.Types.VARCHAR);
		cst.execute();
		System.out.println("Name = "+cst.getString(1));	
	}
}
