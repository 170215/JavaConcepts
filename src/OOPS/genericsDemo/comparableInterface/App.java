package OOPS.genericsDemo.comparableInterface;


public class App {
    public static void main(String[] args) {
        Data dt= new Data(20);
        System.out.println(dt.compareTo(10));
        //dt.compareTo(10);
    }
}

class Data<T extends Comparable<T>> implements Comparable<T>{
    private T myvar;

    public Data(T myvar) {
        this.myvar = myvar;
    }

    public T getMyvar() {
        return myvar;
    }

    @Override
    public int compareTo(T o) {
        return getMyvar().compareTo(o);
    }
}