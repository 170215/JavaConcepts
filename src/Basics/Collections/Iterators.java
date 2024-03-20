package Basics.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {

	public static void main(String[] args) {
		
		//Iterator<String>str = Iterator();
        List<Integer>in = new ArrayList<Integer>();
        in.add(10);
        in.add(20);
        in.add(30);
        in.add(40);
        Iterator<Integer> it = in.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
	}

}
