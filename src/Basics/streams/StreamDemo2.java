package Basics.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Stella micheal","Sheela John ","Peter","Preethi");
		List<String> longnames = names.stream().filter(str->str.length()>2 && str.length()<10)
				.collect(Collectors.toList());
		List<Integer> ints=Arrays.asList(1,2,3,4);
		List<String> tsu=ints.stream().map((i)->String.valueOf(i*i)).collect(Collectors.toList());
		System.out.println(tsu);

		System.out.println("By Regular Method");
		for(String s:longnames) {
			System.out.println(s);
		}
		
		System.out.println("By System.out::println");
		longnames.forEach(System.out::println);
		names.forEach((id)-> System.out.println(id));
	}
}