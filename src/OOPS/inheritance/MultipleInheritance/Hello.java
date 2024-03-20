package OOPS.inheritance.MultipleInheritance;

public class Hello{

    public static void main(String[] args) {

        Person p1= new Person();
        p1.breath();
        p1.enjoy();
    }

}
class Person implements IsAlive ,LiveLife {


    @Override
    public void breath() {
        System.out.println("yes breathing");
    }

    @Override
    public void enjoy() {
        System.out.println("Enjoying the life");
    }
}

