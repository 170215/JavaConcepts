package os_coding.threadDemo1;
//import java.lang.Runnable;
import java.lang.*;
public class PrintTheNumber implements Runnable{
    int numberToprint;
    PrintTheNumber(int num){
        this.numberToprint=num;
    }
    public void run(){
           System.out.println(numberToprint + "thread no " +Thread.currentThread().getName());
    }

}
