package os_coding.Locks;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLocks{

    public static void main(String[] args) {

        SharedResource e1=new SharedResource();
//        e1.producer();
         Thread t1 = new Thread(()->{
                e1.producer();
            });
        SharedResource e2=new SharedResource();
        Thread t2= new Thread(()->{
            e2.producer();
        });

        t1.start();
        t2.start();


    }
}

