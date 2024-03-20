package OOPS.InnerClass.staicInnerClass;

public class Outer {

    public static void hello (){
        System.out.println("hello");
    }
    public static class Inner {
        public static int x = 0;

        public static void testingInnerMethod() {
            System.out.println("testing inner class method");
            System.out.println("Test variable value:"+x );
            hello();
        }

    }
}