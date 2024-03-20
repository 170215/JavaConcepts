package Basics.Datatypes;

public class Primitive {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.runtime.version"));
        byte b= 10;//8bits
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        b=127;
        b++;
        byte b1 = (byte)187;//demotion of values;

        System.out.println(b1);
        short sh =20;
        int in =30;
        long ln=240;
        b=(byte)sh;//demotion will happen forcefully #typecasting

        sh= b;


        long l1= 10000000000l;
        int x=(int) l1;
        System.out.println(x);

        long l2=(long) (1e10+1);
        double d= 2.5;
        float f = 2.5f;//(float)2.5


        char ch = 'x';
        ch =(char)(ch+1);

        System.out.println(ch);

        char ch1 = (char)(65537);
        System.out.println(ch1 +" "+ ch);


        boolean x1= true;
    }
}
