package JDBC_Demo.jdbc;

import java.sql.*;
import java.util.*;

public class JavaOracleUpdate {

			public static void main(String[] args)throws ClassNotFoundException, SQLException {
				// TODO Auto-generated method stub
				Class.forName("oracle.jdbc.driver.OracleDriver");//type of  driver and database name
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sample","root");
				
				Scanner s= new Scanner(System.in);
				System.out.println("enter the empid");
				int emp_id=s.nextInt();
				System.out.println("enter the empName");
				String empName=s.next();
				String s1= "update empl1 set ename=? where empno=?";
				PreparedStatement pst=con.prepareStatement(s1);
				pst.setString(1, empName);
				pst.setInt(2, emp_id);
				
				int i=pst.executeUpdate();
				if(i!=0) {
					System.out.println(" updated successfully");
					
					String q= "Select * from empl1";
					Statement st= con.createStatement();
					ResultSet rs= st.executeQuery(q);
					System.out.println("Em no \t empname \t job");
					while(rs.next()) {
						System.out.print(rs.getInt(1)+"\t");
						System.out.print(rs.getString(2)+"\t");
						System.out.print(rs.getString(3)+"\t");
						System.out.println();
					}
					
					
				}
				
			}
}
