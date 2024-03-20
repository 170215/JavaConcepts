package OOPS.genericsDemo.KeyValueFormat;

public class App {

    public static void main(String[] args) {

        Data<Integer,String> dt1= new Data<>(20,"rupali");
        System.out.println(dt1.getKey());
        dt1.display(20,"40");

    }
}
