package OOPS.copyConstructor;


public class Student implements Cloneable {

    String name;
    Address address;
    int age;
    public Student(String name,int age, Address address) {
        this.name = name;
        this.age=age;
        this.address = address;
    }

    public Student(Student st) {

        this.name= st.name;
        this.address=st.address;
        this.age=st.age;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", age=" + age +
                '}';
    }
}
