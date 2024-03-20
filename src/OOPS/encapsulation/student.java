package OOPS.encapsulation;

public class student {
	String name;
	int age;
	double psp;
	
	public void scheduleSession() {
		System.out.println("schedule a session for "+ this.name);
		
	}
	public void changePsp(double psp) {
		this.psp=psp;
		
	}
	
	

}
