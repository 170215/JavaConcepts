package ExceptionHandelling;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				int c= 2/0;
			}
			catch(Exception e) {
				System.out.println("the error is:"+e);
			}
			
			try {
				int c= 2/0;
			}
			catch(Exception e) {
				System.out.println("the error is: "+e);
			}
			int p=2/0;
		}
		catch(Exception e) {
			System.out.println("the error is : "+e);
		}
		

	}

}
