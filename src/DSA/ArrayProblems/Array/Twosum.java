package DSA.ArrayProblems.Array;

import java.util.HashMap;

public class Twosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {3,4,5,6,8};
		 int target = 7;
		 int[] result =findSum(arr,target);
		// int[] result =findSum(arr,target);

	}
	
	//brute force approach
	static int[] findSum(int[] arr,int target) {
		
		
		
		
		return null;}
	
	//optimal approach
	
	
    static int[] findOptimalSum(int[] arr,int target) {
    	
    	HashMap<Integer,Integer>map = new HashMap<>();
		
		for(int i =0;i<arr.length;i++) {
			
			int comp = target - arr[i];
			if(map.containsKey(comp)) {
				return new int[] {i,map.get(comp)};
			}
			else {
				map.put(arr[i],i);
			}
		}
		
		
		return new int[] {-1,-1};}
}
