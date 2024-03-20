package OOPS.inheritance.Demo1;

public class demo1 {

    public static void main(String[] args){
        //Bike bike = new Bike();
       // bike.handle="short";
       // bike.Engine="Petrol";
       // bike.lights=2;

        Car c1=new Car("Diesel",4,4,"Half",4,"Round","MP3","YES","YES","Bluetooth");
        System.out.println(c1);

        Bike b1= new Bike("Petrol",2,2,"full",2,"short");
        System.out.println(b1.toString());
    }
}

