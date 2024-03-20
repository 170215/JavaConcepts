package Basics.comparatorss;

import java.util.ArrayList;
import java.util.Collections;
//
public class Student implements Comparable<Student> {
	private int roll_no ;
	private int age;
	private String name;
	public Student (int roll_no,int age,String name) {
		System.out.println(this.roll_no);
		this.roll_no= roll_no;
		this.age =age;
		this.name =name;
		
	}
    
	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		return this.roll_no-student.roll_no;
	}
	

}


