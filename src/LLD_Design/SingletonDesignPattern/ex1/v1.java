package LLD_Design.SingletonDesignPattern.ex1;

import LLD_Design.SingletonDesignPattern.ex1.ThreadPool;

public class v1 {

    public static void main(String[] args) {
        ThreadPool threadPool= ThreadPool.getInstance();
        Thread t1= new Thread();
        threadPool.execute(t1);
    }
}
