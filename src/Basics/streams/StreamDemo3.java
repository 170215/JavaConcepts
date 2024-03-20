package Basics.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo3 {

	public static void main(String[] args) {

		List<Fruit> fruits=Arrays.asList(
				new Fruit("Mango","Medium"),
				new Fruit("Orange","Medium"),
		new Fruit("Grapes","small"),
				new Fruit("Banana","Medium"),
		new Fruit("Watermelon","Big"),
				new Fruit("Orange","Medium"),
		new Fruit("Mango","Medium"),
				new Fruit("Watermelon","Big"),
		new Fruit("Mango","Big"),
				new Fruit("Orange","Medium"),
		new Fruit("Pineapple","Big"),
				new Fruit("Watermelon","Big")
		);
		Map<String,Map<String,Long>> fruitCount=
		fruits.stream()
				.collect(Collectors.groupingBy(fruit -> fruit.name,Collectors.groupingBy(fruit->fruit.size,Collectors.counting())));
		System.out.println(fruitCount);
		Map<String,Long> counts=fruits.stream()
				.collect(Collectors.groupingBy(fruit -> fruit.name,Collectors.counting()));
		System.out.println(counts);
//		List<Integer> num =new ArrayList<Integer>();
//		num.add(1);
//		num.add(2);
//		num.add(3);
//		num.add(4);
//
//		List<Integer> squares = num.stream().map(n->n*n).collect(Collectors.toList());
//
//		System.out.println(squares);
//		squares.forEach(System.out::println);
	}
}

class Fruit{
	String name;
	String size;

	public Fruit(String name, String size) {
		this.name = name;
		this.size = size;
	}
}

