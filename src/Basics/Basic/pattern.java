package Basics.Basic;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hollow rectangle
         for(int i =1;i<=4;i++) {
        	 for(int j =1;j<=5;j++) {
        		 
        		 if(i ==1 || i==4 || j ==5 || j==1) {
        			 System.out.print("*");
        		 }
        		 else {
        			 System.out.print(" ");
        		 }
        		 
        		 
        	 }
        	 System.out.println();
         }
         
         
         /// half pyramid
         for(int i =1;i<=4;i++) {
        	 for(int j =1;j<=i;j++) {
        		 
        		
        	 System.out.print("*");
         }
        	 System.out.println();
         
	}
       /// half pyramid
         for(int i =4;i>=1;i--) {
        	 for(int j =1;j<=i;j++) {
        		 
        		
        	 System.out.print("*");
         }
        	 System.out.println();
         
	}
       //90degree rotate
         for(int i =1;i<=4 ;i++ ) {
        	 for(int j =1;j<=4 -i;j++) {
        		 
        		
        	 System.out.print(" ");
         }
        	 for(int j =1;j<=i ;j++) {
        		 System.out.print("*");
        	 }
        	 System.out.println();
	}
	
       //problem4
         for(int i =1;i<=4 ;i++ ) {
        	 for(int j =1;j<=i;j++) {
        		 
        		
        	 System.out.print(j);
         }
        	 
        	 System.out.println();
	}
       //problem5
         for(int i =1;i<=4 ;i++ ) {
        	 
        	 for(int j =1;j<=i ;j++) {
        		 System.out.print("*");
        	 }
        	 System.out.println();
	}
             for(int i =1;i<4 ;i++ ) {
        	 
        	 for(int j =1;j<=4-i ;j++) {
        		 System.out.print("*");
        	 }
        	 System.out.println();
	}
	
	}
	
	
	

}
