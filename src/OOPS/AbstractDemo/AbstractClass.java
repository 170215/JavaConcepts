package OOPS.AbstractDemo;

//An instance of an abstract class can not be created.
//Constructors are allowed.
//We can have an abstract class without any abstract method.
//Abstract classes can not have final methods because when you make a method final you can not override it but the abstract methods are meant for overriding.
//We are not allowed to create object for any abstract class.
//We can define static methods in an abstract class




public class AbstractClass {
	
	public static void main(String[] args) {
		
		Flat1 obj1 = new Flat1();
		obj1.hall();
		obj1.bathroom();
		obj1.ameities();
		obj1.CantbeOverridden();
		
		System.out.println("maintanance fee for flat1 :" +obj1.maintenance_fee);
		Flat2 obj2 = new Flat2();
		obj2.hall();
		obj2.bathroom();
		obj2.ameities();
		System.out.println("maintanance fee for flat1 :" +obj2.maintenance_fee);
	}

}


abstract class Apartment{
	double  maintenance_fee = 2500;
	abstract void kitchecn();
	abstract void bathroom();
	abstract void hall();
	abstract void bedroom();
	//constructer
	Apartment(){
		System.out.println("hey welcome to the apartment");
	}
	void ameities() {
		System.out.println("there is a GYM");
		System.out.println("there is a park");
	}
	final void CantbeOverridden() {
		System.out.println("hello");
	}
}
class Flat1 extends Apartment{
void hall() {
		System.out.println("---flat1---");
		System.out.println("12*13");
	}
	void bedroom() {
		System.out.println("8*9");
	}
	void bathroom() {
		System.out.println("5*6");
	}
	
	void kitchecn() {
		// TODO Auto-generated method stub
		System.out.println("6*8");
	}
	
	
}

class Flat2 extends Apartment{
	void hall() {
		System.out.println("---flat2---");
		System.out.println("12*13");
	}
	void bedroom() {
		System.out.println("8*9");
	}
	void bathroom() {
		System.out.println("5*6");
	}
	
	void kitchecn() {
		// TODO Auto-generated method stub
		System.out.println("6*8");
	}
}