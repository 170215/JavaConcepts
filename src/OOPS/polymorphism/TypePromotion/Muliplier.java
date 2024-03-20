package OOPS.polymorphism.TypePromotion;

public class Muliplier {
    void Multiplier() {
    }

    static int multiply(int a, int b) {
       return a * b;
   }

    public static void add(int i, long j) {
        System.out.println((long)i * j + " hello");
    }

    public static void add(int i, int j) {
        System.out.println(i * j + "bye");
    }

    static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    public static void main(String[] args) {
        System.out.println(multiply(3, 4));
        System.out.println(multiply(2, 3, 4));
        long b = 29L;
        add(4, b);
    }
}
