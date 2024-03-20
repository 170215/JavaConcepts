package OOPS.interfaceDemo;



import java.util.*;
class Apples {
    private static long counter;
      private final long id = counter++;
    public long id() { return id; }
}
class Orange extends Apples{}
//public class ApplesAndOrangesWithoutGenerics {
////    @SuppressWarnings("unchecked")
//
//}

public class demo1 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList<Apples> apples = new ArrayList();
        for(int i=0;i<3;i++){
            apples.add(new Apples());
        }
        apples.add(new Orange());

        for(int i = 0; i < apples.size(); i++)
            ((Apples)apples.get(i)).id();
        // Orange is detected only at run time
        for (Apples a: apples) {
            System.out.print(a);
        }
    }
}