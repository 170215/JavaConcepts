package JDBC_Demo.jdbc;

import java.sql.*;
import java.util.Scanner;

public class HandsOn3_price {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
	/*	Scanner s= new Scanner(System.in);
	
		Class.forName("oracle.jdbc.driver.OracleDriver");//type of  driver and database name
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mayuri","mayuri");
		
		System.out.println("Price :");
		int price = s.nextInt();

		
		String s1 = "{call book(?,?)}";
		CallableStatement cst = con.prepareCall(s1);
		cst.setInt(1, price);
		
		cst.registerOutParameter(2, java.sql.Types.VARCHAR);
		cst.execute();
		
		ResultSet rs = cst.getResultSet();
		System.out.print("\t"+rs+"\n");
				
		String q= "Select * from book_details";
		Statement st= con.createStatement();
		rs= st.executeQuery(q);
		System.out.println("Book ID \t Book Name \t Author Name \t Publisher Name \t Price");
		while(rs.next()) {
			System.out.print(rs.getInt(1)+"\t \t ");
			System.out.print(rs.getString(2)+"\t \t ");
			System.out.print(rs.getString(3)+"\t \t ");
			System.out.print(rs.getString(4)+"\t \t \t ");
			System.out.print(rs.getInt(5)+"\t \t ");
			System.out.println();
			System.out.print(rs.getString(2)+"\t \t ");
		}

//		System.out.println("Book ID \t Book Name \t Author Name \t Publisher Name \t Price");
		
		cst.getMoreResults();
		rs = cst.getResultSet();
		while(rs.next())
		{
		
			System.out.print(rs.getString(2)+"\t \t ");
		
	//	System.out.print(cst.getInt(2)+"\t \t ");
		System.out.println();
	}
	*/
		
		Scanner s = new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");//type of  driver and database name
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mayuri","mayuri");
		
		System.out.println("Price :");
		int price = s.nextInt();
		ResultSet rs;
		
		CallableStatement call = con.prepareCall("{call book(?,?)}");
		call.setInt(1, price);
		call.registerOutParameter(2, Types.VARCHAR);
		boolean result = call.execute();
		System.out.println(result);
		if(!result) {
			rs = call.getResultSet();
			while(rs.next()) {
				System.out.println(rs.getString(2));
			}
		}
	}

}
