package OOPS.composition;

public class App {

    public static void main(String[] args) {
        Laptop lappy = new Laptop();
        System.out.println(lappy.getProcessor().getBrand());
        Processor pro= new Processor("Intel","7200u",6,4,8,"2MB","2.5GHz","2.5GHz","3.1GHz");
        GraphicsCard gc = new GraphicsCard("Nvidia",1050,"4GB");

        Laptop gL= new Laptop(17f,pro,"DDR4","2TB",gc,null,"backlit");

        System.out.println(gL);
        gL.gamingMode();
        System.out.println(gL.getProcessor().getFrequency());
        System.out.println("Game mode is on");
    }
}
