package os_coding.usingThreadClass;

public class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Thread is running" + Thread.currentThread().getName());
    }
    public static void main(String[] args)
    {
        MyThread t = new MyThread();
        t.start();
    }
}
