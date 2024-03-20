package OOPS.copyConstructor;

public class client {
    public static void main(String[] args) {

         Address address =new Address("123 Main St","Banglore");

         Student st = new Student("rupali",23,address);
         Student st1 = new Student(st);
         st.setName("Anchal");
         st.age=24;
         st.getAddress().setStreet("124 st");

         System.out.println(st1);



    }
}
