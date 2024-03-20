package JDBC_Demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HandsOn2_Student {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");//type of  driver and database name
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mayuri","mayuri");
		
		Scanner s= new Scanner(System.in);
			
		int cont = 1;
		
		while(cont == 1) {
		System.out.println("Enter your choice : \n I/i - Insert \n U/u - Update \n D/d - Delete \n S/s - Display");
		String choice = s.next();
		
		switch(choice) {
		case "I" : 
		case "i" :
			System.out.println("------------Insert Values----------");
			System.out.println("Enter Student Id");
			int stdid=s.nextInt();
			System.out.println("Enter the Name of the Student");
			String stdname=s.next();
			System.out.println("Enter the Discipline");
			String disc=s.next();
			System.out.println("Enter the Book Id");
			int bookid=s.nextInt();
			
			String str="insert into student_details values('"+stdid+"','"+stdname+"','"+disc+"','"+bookid+"')";
			Statement st1=con.createStatement();
			int i=st1.executeUpdate(str);
			if(i!=0) {
				System.out.println("Your record has been Inserted successfully");
			}
			else {
				System.out.println("Sorry, No operations performed!!");
			}
			break;
			
		case "U" :
		case "u" :
			System.out.println("-------Update the Book ID----------");
			System.out.println("Enter Student ID");
			stdid=s.nextInt();
			System.out.println("Enter New Book ID");
			bookid=s.nextInt();
			
			String s1= "update student_details set book_id=? where st_id=?";
			
			PreparedStatement pst=con.prepareStatement(s1);
			pst.setInt(1, bookid);
			pst.setInt(2, stdid);
			
			i = pst.executeUpdate();
			if(i!=0) {
				System.out.println(" Record has been updated successfully!!");
			}
			else {
				System.out.println("Sorry, No operations performed!!");
			}
			break;
			
		case "D" :
		case "d" :
			System.out.println("-------Delete the Record----------");
			System.out.println("Enter Student Id");
			stdid=s.nextInt();
			
			String s2= "delete student_details where st_id=?";
			
			PreparedStatement delete_pst = con.prepareStatement(s2);
			delete_pst.setInt(1, stdid);
			
			i = delete_pst.executeUpdate();
			if(i!=0) {
				System.out.println(" Record has been deleted successfully!!");
			}
			else {
				System.out.println("Sorry, No operations performed!!");
			}
			break;
			
		case "S" :
		case "s" :
			System.out.println("Enter \n 1 for Student Details \n 2 for Book Details");
			int det = s.nextInt();
			switch(det) {
			case 1 :
				String q= "Select * from student_details";
				Statement st= con.createStatement();
				ResultSet rs= st.executeQuery(q);
				System.out.println("Student ID \t Student Name \t Discipline \t Book ID");
				while(rs.next()) {
					System.out.print(rs.getInt(1)+"\t \t ");
					System.out.print(rs.getString(2)+"\t \t ");
					System.out.print(rs.getString(3)+"\t \t ");
					System.out.print(rs.getString(4)+"\t \t \t ");
					System.out.println();
				}
				break;
				
			case 2 :
				String q1= "Select * from book_details where book_id=(select book_id from student_details)";
				Statement st2= con.createStatement();
			//	PreparedStatement st2=con.prepareStatement(s1);
			//	st2.setInt(1, bookid);
				ResultSet rs1= st2.executeQuery(q1);
				System.out.println("Book ID \t Book Name \t Author Name \t Publisher Name \t Price");
				while(rs1.next()) {
					System.out.print(rs1.getInt(1)+"\t \t ");
					System.out.print(rs1.getString(2)+"\t \t ");
					System.out.print(rs1.getString(3)+"\t \t ");
					System.out.print(rs1.getString(4)+"\t \t \t ");
					System.out.print(rs1.getInt(5)+"\t \t ");
					System.out.println();
				}
				break;
			}
			
			break;
		
		default :
			System.out.println("You entered wrong choice!");
			break;
		}
		
		
		System.out.println("Do you want to perform more operations? \n Y-1/N-2");
		cont = s.nextInt();
		
	}
		
	}
}
