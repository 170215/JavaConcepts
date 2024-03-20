package OOPS.inheritance.Demo1;

public class Bike extends vehicle {
    private String handle;

    public Bike(String handle) {
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }

    public Bike(String engine, int wheels, int seats, String fueltank, int lights, String handle) {
        super(engine, wheels, seats, fueltank, lights);
        this.handle = handle;
    }


    @Override
    public String toString() {
        return "Bike{" + "handle='" + handle + '\'' +
                ",engine='" + getEngine() + '\'' +
                ", wheels=" + getWheels() +
                ", seats=" + getSeats() +
                ", fueltank='" + getFueltank() + '\'' +
                ", lights=" + getLights() +
                '}';
    }
}
