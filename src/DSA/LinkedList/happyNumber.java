package DSA.LinkedList;

public class happyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 89;
        System.out.println(isHappy(n));
	}
   static boolean isHappy(int n) {
	    int slow = n;
	    int fast = n;
	    do {
	    	slow= square(slow);
	    	fast= square(square(fast));
	    }while(slow!=fast);
	    
	   if(slow==1) {
		   return true;
	   }
	return false;
	   
   }
   static int square(int n) {
	   if(n==0) {
		   	return 0;
	   }
	   int r = n%10;
	   return (int) (Math.pow(r, 2)+square((int)n/10))  ;
	   }
}
