package Basics.comparatorss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> st = new ArrayList<>();
		Student s1 = new Student(20,14,"rohan");
		Student s2 = new Student(21,14,"rahul");
		Student s3 = new Student(19,14,"reena");
		
		st.add(s1);
		st.add(s2);
		st.add(s3);
		
		Collections.sort(st, new Comparator<Student>() {
		    public int compare(Student a, Student b) {
		        return a.getRoll_no()-b.getRoll_no();
		    } 
		 });
		Collections.sort(st);
		st.forEach(s->System.out.println(s.getName()));

	}

}
