package JDBC_Demo.jdbc;

import java.sql.*;
import java.util.*;

public class CallableStatementDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the deptid");
		int dept_id=s.nextInt();
		System.out.println("enter the deptName");
		String deptName=s.next();
		System.out.println("enter the location");
		String loc=s.next();
		Class.forName("oracle.jdbc.driver.OracleDriver");//type of  driver and database name
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mayuri","mayuri");
		
		String s1 = "{call ins_department(?,?,?)}";
		CallableStatement cst = con.prepareCall(s1);
		cst.setInt(1, dept_id);
		cst.setString(2, deptName);
		cst.setString(3, loc);
		cst.execute();
		System.out.println("Inserted");
	}

}
