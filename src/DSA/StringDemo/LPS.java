package DSA.StringDemo;

import java.util.Arrays;

public class LPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x=LPSCount("aabaaba");
//		for(int i=0;i<x.length;i++) {
//			System.out.println(x[i]);
//		}
		
		System.out.println(Arrays.toString(x));
        if(isLPS("abab") ) {
        	System.out.println("yes it contains");
        	
        }
        else {
        	System.out.println("false");
        }
	}
    private static boolean isLPS(String s) {
		// TODO Auto-generated method stub
    	int n= s.length();
    	for(int l=1;l<n;l++) {
			int p1=0,p2=n-l;
			boolean ok =true;
			for(int j=0;j<l;j++) {
	    		if(s.charAt(p1)!=s.charAt(p2)) {
	    			
	    			ok=false;
	    			break;
	    			
	    		}
	    		
	    		p1++;
	    		p2++;
	    	}
			if(ok==true) {
	    		return true;
	    	}
			
    		
    	}
    	
		return false;
	}
	public static int[] LPSCount(String s) {
    	
    	int[] LPS= new int[s.length()];
    	int n= s.length();
    	for(int i=0;i<n;i++) {
    		LPS[i]=0;
    	}
//    	int k=1;
    	int l=0;
    	for(int i=2;i<n;i++) {
    		for(l=1;l<i;l++) {
    			int p1=0,p2=i-l;
    			boolean ok =true;
    			for(int j=0;j<l;j++) {
    	    		if(s.charAt(p1)!=s.charAt(p2)) {
    	    			
    	    			ok=false;
    	    			break;
    	    			
    	    		}
    	    		
    	    		p1++;
    	    		p2++;
    	    	}
    			if(ok) {
    				System.out.println(l+" " + i);
    				LPS[i-1]=l;
    			}
        		
        	}
    		
    	}
    	
		return LPS;
    	
    }
}
