package jvm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//A Java program to demonstrate working
//of a Class type object created by JVM
//to represent .class file in memory.
public class jvmDemo {

	public static void main(String[] args) {
		
		// Getting hold of Class
        // object created by JVM.
            Student s = new Student();
            // Printing type of object using c1.
            Class c1 = s.getClass()	;
            System.out.println(c1.getName());
            Method m[] = c1.getDeclaredMethods();
            for(Method m1 :m) {
            	System.out.println(m1.getName());
            		
            }
            Field f[] = c1.getDeclaredFields();
            for(Field f1:f) {
            	System.out.println(f1.getName());
            }
         // String class is loaded by bootstrap loader, and
            // bootstrap loader is not Java object, hence null
            System.out.println(String.class.getClassLoader());
      
            // Test class is loaded by Application loader
            System.out.println(Student.class.getClassLoader());
            }

}
 class Student{
	 int roll_no;
	 String name;
	 Student(int x, String Name){
		 roll_no = x;
		 name =Name;
	 }
	 /**
	 * @return the roll_no
	 */
	public int getRoll_no() {
		return roll_no;
	}
	/**
	 * @param roll_no the roll_no to set
	 */
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	Student()
	 {
		 roll_no=0;
		 name = null;
	 }
 }