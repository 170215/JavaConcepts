package os_coding.threadDemo;

public class demo {

    public static void main(String[] args){
        //which thread is executing
        System.out.println("hello "+ Thread.currentThread().getName());
        HelloPrinter hp = new HelloPrinter();
        Thread td = new Thread(hp);
        td.start();
    }
}
