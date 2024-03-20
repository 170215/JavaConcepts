package OOPS;

public class ArrayOfObjects {

	public static void main(String[] args) {
		
         Student[] obj = new Student[5];
         obj[0] = new Student("rupali",22,"Nawagarh",882753315);
         System.out.println(obj[0].getAge());

         
	}

}
class Student{
	String name;
	int age;
	String address;
	long ph;
	//constructer
	Student(String name, int age , String address,long ph){
		this.name = name;
		this.age = age;
		this.address = address;
		this .ph = ph;
	}
	//getter and setter method
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPh() {
		return ph;
	}
	public void setPh(long ph) {
		this.ph = ph;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}