package Basics.Basic.Enum;


public class Example {

    public static void main(String[] args) {

        for(Season s: Season.values()) {
            System.out.println(s.getH());
            //enum extends Enum class
            System.out.println(s.getClass().getSuperclass().getName());
        }
    }
}
