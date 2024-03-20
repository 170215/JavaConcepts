package JDBC_Demo.jdbc;

import java.sql.*;
import java.util.*;

public class JavaToOracle1 {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
//			Scanner s= new Scanner(System.in);
//			System.out.println("enter the deptid");
//			int emp_id=s.nextInt();
//			System.out.println("enter the deptName");
//			String empName=s.next();
//			System.out.println("enter the location");
//			String job=s.next();
			//cps-prod.cb2flhonu4tz.us-west-2.rds.amazonaws.com:1521/CPSAMP
			Class.forName("oracle.jdbc.driver.OracleDriver");//type of  driver and database name
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/CPSAMP", "cps_user", "cps_user");
			//cps-prod.cb2flhonu4tz.us-west-2.rds.amazonaws.com
			if(con!=null) {
				System.out.println("connected");
			}
//			String str="insert into department(deptno,dname,loc)values('"+emp_id+"','"+empName+"','"+job+"')";
//			Statement st1=con.createStatement();
//			int i=st1.executeUpdate(str);
//			if(i!=0) {
//				System.out.println("Inserted successfully");
//			}
			String str1= "SELECT * FROM cps.TRANS_PROFILE WHERE PROFILE_NAME  IN('Springer_JATS')";
			Statement st= con.createStatement();
			ResultSet rt=st.executeQuery(str1);
//			System.out.println("Deptno \t Dept name \t Location");
			if(rt.next()) {
//			    System.out.print(rt.getInt(1)+"\t");
//				System.out.print(rt.getString(2)+"\t");
//				System.out.print(rt.getString(3)+"\t");
//				System.out.println();
				int x = rt.getInt(3);
				String f1= "SELECT *FROM CPS.FILTERCHAIN f WHERE FILTERCHAIN_ID=" + x;
				Statement st1=con.createStatement();
				ResultSet rt1=st1.executeQuery(f1);
				if(rt1.next()) {
					System.out.print(rt1.getString(4)+"\t");
				}
			}
			

		}

	}


