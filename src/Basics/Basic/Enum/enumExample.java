package Basics.Basic.Enum;

import java.io.Console;

public class enumExample {
    public enum Season{WINTER,SPRING,SUMMER,FALL};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Season s:Season.values()) {
			System.out.println(s);
		}

		Season season=Season.FALL;
		switch (season){
			case WINTER:
				System.out.println("its winter");
			case SPRING:
				System.out.println("Its Spring");
			case SUMMER:
				System.out.println("its summer");
			default:
				System.out.println("Its Fall");
		}
//		Console c = System.console();
//		String text = c.readLine();
//		System.out.println(text);
		int a=10;
		int b=20;
		swap(a,b);
		System.out.println(a+" "+b);

	}
    public static void swap(int a,int b) {
    	int temp = a;
    	a=b;
    	b= temp;
    }
}
