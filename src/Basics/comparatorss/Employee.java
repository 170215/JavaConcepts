package Basics.comparatorss;
//implements Comparable<Employee>
public class Employee {
	private String name;
	private int id;
	private int salary;
	public Employee(String string, int i, int j) {
		// TODO Auto-generated constructor stub
		name = string;
		id= i;
		salary = j;
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
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
//	@Override
//	public int compareTo(Employee st) {
//		// TODO Auto-generated method stub
//		return this.id-st.id;
//	}
//	

	
}
