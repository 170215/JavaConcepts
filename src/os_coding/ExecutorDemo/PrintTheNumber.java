package os_coding.ExecutorDemo;
//import java.lang.Runnable;

public class PrintTheNumber implements Runnable{
    int numberToprint;
    PrintTheNumber(int num){
        this.numberToprint=num;
    }
    public void run(){
           System.out.println(numberToprint+" thread"+Thread.currentThread().getName());
    }

}
