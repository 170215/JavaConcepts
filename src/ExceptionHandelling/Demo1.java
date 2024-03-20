package ExceptionHandelling;

import java.io.DataInputStream;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataInputStream  din = new DataInputStream(System.in);
		
		try {
			try{
				someMethod();
			}
			catch(ArithmeticException e) {
				System.out.println(e);

			}
			String str = "helllo";
			System.out.println(" string is "+str.substring(0,9));
			
		}

		catch(IndexOutOfBoundsException ie) {
			System.out.println("index out of Bound Exception");
		}
		catch(Exception e) {
			System.out.println(e);

		}
//		

	}

	private static void someMethod() {
          throw new ArithmeticException();
	}


}
