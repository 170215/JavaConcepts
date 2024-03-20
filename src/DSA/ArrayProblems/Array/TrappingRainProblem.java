package DSA.ArrayProblems.Array;

import java.util.Arrays;

public class TrappingRainProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr= {5,3,6,3,4,7,2,4,5};
     System.out.println( First_Approach(arr));
     //System.out.println( Second_Approach(arr));
	}
	static //time complexity O(n**2)
	int First_Approach(int[] arr) {
	     int n = arr.length;
	     int ans =0;
		for(int i =1;i<n-1;++i) {
			 int height = arr[i];
			 int left_max = arr[0];
			 
			 int right_max = arr[n-1];
			 
			for(int j =1; j<=i;++j) {
				if(left_max <= arr[j])
				
				{
					left_max = arr[j];
				}
				
			}System.out.println(left_max);
			
            for(int j =n-2; j>=i;--j) {
            	if(right_max <= arr[j])
    				
				{
					right_max = arr[j];
				}
            	
			}
            System.out.println(right_max);
            System.out.println(arr[i]);
            int support = Math.min(left_max, right_max);
			ans +=  Math.abs(support - arr[i]);
			
			System.out.println("the ans is"+ans);
			
		}
     return ans;
	}
	//timecomplexity O(n) and space complexity o(n)
	static int Second_Approach(int[] arr) {
		int n = arr.length;
	     int ans =0;
	     
	     int[] left_max= new int[n];
	     left_max[0]= arr[0];
	     
	     
		 int[] right_max = new int[n];
		 right_max[n-1]= arr[n-1];
		
		for(int j =1; j<n;++j) {
			left_max[j]= Math.max(arr[j], left_max[j-1]);
			
		}
		for(int j =n-2; j>=0;--j) {
			right_max[j]= Math.max(arr[j], right_max[j+1]);
			
		}
		
       System.out.println(Arrays.toString( left_max));
       System.out.println(Arrays.toString( right_max));;
	  for(int i =0;i<n;++i) {
			 
           
             int support =Math.min(left_max[i], right_max[i]);
             System.out.println(support);
			ans +=  Math.abs(support - arr[i]);
			
			System.out.println("the ans is"+ans);
			
		}
    return ans;
		
		
		
		
		
	     
		}
		
		
		
	
}
