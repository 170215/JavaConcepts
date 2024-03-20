package ExceptionHandelling;

import java.io.DataInputStream;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args)throws ArithmeticException {
		// TODO Auto-generated method stub
//		DataInputStream din = new DataInputStream(System.in);
		Scanner sc =new Scanner(System.in);
		try {
			 int a = sc.nextInt();
			 int b= sc.nextInt();
			 int c = a/b;
			 int[] arr= new int[2];
			 arr[3]=5;
		}
		catch(ArithmeticException e ) {
			System.out.println("the Exception is:"+e);
		}
		catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("the Exception is:"+e);
		}
		finally {
			System.out.println("yes it's done");
		}

	}

}
