package Basics.Basic;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[][] = {{2,7,9},{2,6,1},{7,4,2}};
        Scanner sc = new Scanner(System.in);
        int arr1[][]= new int[3][3];
	    for(int i =0;i<3;i++) {
	    	for(int j=0;j<3;j++) {
	    		System.out.println(arr[i][j] + " ");
	    		arr1[i][j]= sc.nextInt();
	    	}
	    }
	  System.out.println("hello");
	  System.out.print("hi");
	  System.out.println("hello \n hi");
	  for(int i =1;i<5;i++) {
		  
		  for(int j =1;j<=i;j++) {
			  
			  System.out.print("*");
			  
		  }
		  System.out.println("\n");
	  }
	  
	  //column not fixed 
	  int[][] array = {
			  {1,2,3,4},{5,6},{8,9,20}
	  };
	  for(int row =0;row<array.length;row++) {
		  for(int col =0;col<array[row].length;col++) {
			  System.out.println(array[row][col]);
		  }
	  }
	  for(int row =0;row<array.length;row++) {
		  
			  System.out.println(Arrays.toString(array[row]));
		  
	  }
	  
	}

}
