package DSA.dp;

import java.util.ArrayList;

public class generateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(generate(3,3).toString());
		System.out.println(generate(3,3).size());
		ArrayList<Integer> res = new ArrayList<>();
		printgenerate(3,3,res);

	}
    private static void printgenerate(int n, int k, ArrayList<Integer> res) {
    	
		// TODO Auto-generated method stub
    	if(n==0) {
    		System.out.println(res.toString());
    		return ;
    	}
    	for(int d=0;d<k;d++) {
    		res.add(d);
    		printgenerate(n-1,k,res);
    		int index = res.size() - 1;
    		res.remove(index);
    	}
		
	}
	//ArrayList<String> res = new ArrayList<>();
	private static  ArrayList<String> generate(int n, int k) {
		// TODO Auto-generated method stub
		 ArrayList<String> res = new ArrayList<>();
		if(n==0) {
			
				
			res.add(" ");
				
			
			//System.out.println(res.size());
			return res;
		}
		
		ArrayList<String> smaller;

		smaller = generate(n-1,k);
		
		for(int d=0;d<k;d++) {
			for(int j=0;j<smaller.size();j++) {
				//System.out.println(res.get(j));
				String str =smaller.get(j)+d;
				res.add(str);
			}
		}
		//System.out.println(res.toString());
		
		return res ;
		
	}

}
