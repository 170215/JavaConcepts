package JDBC_Demo.jdbc;

import java.sql.*;
import java.util.Scanner;

public class CollableSelect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the deptid");
		int dept_id=s.nextInt();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");//type of  driver and database name
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mayuri","mayuri");
		
		String s1 = "{call selDept(?,?)}";
		CallableStatement cst = con.prepareCall(s1);
		cst.setInt(1, dept_id);
		cst.registerOutParameter(2, Types.VARCHAR);
		cst.execute();
		System.out.println("Loaction = "+cst.getString(2));	
	}
}
