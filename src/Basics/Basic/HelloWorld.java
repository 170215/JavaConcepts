package Basics.Basic;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
import java.util.UUID;

//public as it should be accessible in another program also
public class HelloWorld {
    //static methods get executed without creating any object
	public static void main(String[] args) {
        try {
            // TODO Auto-generated method stub
            System.out.println("hello");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String agevalue = sc.next();
            int age = sc.nextInt();
            //System.out.print(age);

            System.out.println(str + agevalue + " " + age);
            UUID uuid = UUID.randomUUID();
            System.out.println(uuid);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
	}

}
