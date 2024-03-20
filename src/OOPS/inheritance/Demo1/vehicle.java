package OOPS.inheritance.Demo1;

public class vehicle {

private String Engine;
private int Wheels;

private int seats;
private String Fueltank;

private int lights;

    public vehicle(String engine, int wheels, int seats, String fueltank, int lights) {
        Engine = engine;
        Wheels = wheels;
        this.seats = seats;
        Fueltank = fueltank;
        this.lights = lights;
    }

    public vehicle() {
        this.Engine="petrol";
        this.Wheels=4;
        this.seats=4;
        this.Fueltank="full";
        this.lights=4;
    }

    public String getEngine() {
        return Engine;
    }

    public int getWheels() {
        return Wheels;
    }

    public int getSeats() {
        return seats;
    }

    public String getFueltank() {
        return Fueltank;
    }

    public int getLights() {
        return lights;
    }

    @Override
    public String toString() {
        return "vehicle{" +
                "Engine='" + Engine + '\'' +
                ", Wheels=" + Wheels +
                ", seats=" + seats +
                ", Fueltank='" + Fueltank + '\'' +
                ", lights=" + lights +
                '}';
    }
}
