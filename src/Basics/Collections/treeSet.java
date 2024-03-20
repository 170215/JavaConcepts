package Basics.Collections;

import java.util.Set;
import java.util.TreeSet;
public class treeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set<Integer> tset = new TreeSet<Integer>();
        tset.add(7);
        tset.add(4);
        tset.add(4);
        tset.add(5);
        System.out.println(tset);
	}

}
