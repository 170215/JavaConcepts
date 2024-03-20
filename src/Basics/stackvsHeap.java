package Basics;

import java.util.HashMap;
import java.util.Random;

public class stackvsHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//         new stackof();
		
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		Random r= new Random();
		while(true) {
			map.put(r.nextInt(), 1);
		}
	}
	

}
//stackoverflow error
class stackof{

	public stackof() {
		new stackof();
	}
	
}
