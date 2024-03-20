package Basics.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class StreamsInJava {

	
	//promote the functional programming paradigm in java
	//help us iterating  through collections
	
	public static void main(String[] args) {
		
		
		
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		List<Integer> slist = new ArrayList<>();
//		for(Integer i : list) {
//			slist.add(i*i);
//		}
		
		//streams - using map method
		slist  = list.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(slist);
		List<String>str = new ArrayList<String>();
		str.add("rupali");
		str.add("janvi");
		str.add("megha");
		for(String i :str) {
			if(i.startsWith("j")) {
				System.out.println("hello");
			}
		}
		//filter method
		List<String> sl = new ArrayList<String>();
		sl = str.stream().filter(s->s.startsWith("j")).collect(Collectors.toList());
		
		System.out.println(sl);
		slist.stream().map(x->x*x).forEach(y-> System.out.println(y));
		//streams  - using foreach
		
		List<Integer> number = Arrays.asList(1,2,3,4,5);
		number.stream().sorted().forEach(t->System.out.println(t));
		number.stream().map(x->x*x).forEach(y->System.out.println(y));
		
		int sum =  number.stream().reduce(0, (ans,i)->ans +i);
		System.out.println(sum);
	}
}
