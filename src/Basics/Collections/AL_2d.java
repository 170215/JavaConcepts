package Basics.Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class AL_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc= new Scanner(System.in);
         ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
         for(int i =0;i<3;i++) {
        	 lst.add(new ArrayList<>());
         }
         for(int i =0;i<3;i++) {
        	 for(int j =0;j<3;j++) {
            	 lst.get(i).add(sc.nextInt());
             }
         }
         for(int i =0;i<3;i++) {
        	 for(int j =0;j<3;j++) {
            	 System.out.println(lst.get(i));
             }
         }
	}

}
