package OOPS.genericsDemo.BoundedParameter;



public class App {

    public static void main(String[] args) {

        Data<Integer,App> dt1= new Data<>(20,new App());
        System.out.println(dt1.getKey());
        dt1.display('c',20);
        dt1.display('2',8.0);

    }
}
