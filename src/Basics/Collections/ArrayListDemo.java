package Basics.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import java.util.stream.Stream;


public class ArrayListDemo {

//	

	public static void main(String[] args) {
		
//)
		ArrayList<String> arr= new ArrayList<>();
		
		arr.add("rupali");

		arr.add(0,"Poorva");
		arr.add(0,"Shruti");
		
		System.out.println(arr);
		System.out.println();
		Object[] a =arr.toArray();
		for (String x:arr){
			System.out.println(x);
		}
		ArrayList ax = new ArrayList();
		
		ax.addAll(arr);
		String x= ax.toString();
		System.out.println(x);
		

//		//clearing the array
//		ax.clear();
//		System.out.println(ax);
//		
		//cloning 
		ArrayList x1= (ArrayList) ax.clone();
		
		//check if it contains an element or not
		System.out.println(ax.contains("poorva"));
		ax.add("saloni");
		System.out.println(ax.containsAll(arr));
		//
		
		//using iterator
		Iterator y= ax.iterator();
		while(y.hasNext()) {
			System.out.println(y.next());
		}
		Iterator y1= ax.listIterator();
		while(y1.hasNext()) {
			System.out.println(y1.next());
		}
		Stream b =ax.stream();
		Vector v = new Vector();
		v.addAll(ax);
		System.out.println(v); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		 System.out.println(arr.subList(1,3));

   
          //cloning the object
          Object a1 = arr.clone();
          Object b1 = a1;
          if(a1.equals(b1)) {
        	  System.out.println( "hey");
          }

          
	}
//So the backing array is not growing, every time when it is full, The ArrayList class is creating a new array of bigger size and 
	//copies all the elements from the old array to the new array. And now it is using the new array�s reference for its internal usage. 
	//As the old array is no longer in use, it will be garbage collected in the next garbage collection.

}
