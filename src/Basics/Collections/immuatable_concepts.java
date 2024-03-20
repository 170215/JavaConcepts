package Basics.Collections;

public class immuatable_concepts {
	//string is immutable
	
      public static void main(String[] args) {
    	//  
    	  
    	final int[] x= {10};//why it is final?
  		Runnable tx =new Runnable(){
			public void run() {
				x[0]++;
			}
			
		};
		
		tx.run();
      }
      
}
