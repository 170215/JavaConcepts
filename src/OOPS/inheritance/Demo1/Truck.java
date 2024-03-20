package OOPS.inheritance.Demo1;

public class Truck extends vehicle {
    private String steering;
    private String musicSystem;
    private String airConditioner;
    private int container;

    public Truck(String steering, String musicSystem, String airConditioner, int container) {
        this.steering = steering;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.container = container;
    }

    public Truck(String engine, int wheels, int seats, String fueltank, int lights, String steering, String musicSystem, String airConditioner, int container) {
        super(engine, wheels, seats, fueltank, lights);
        this.steering = steering;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.container = container;
    }

    public String getSteering() {
        return steering;
    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    public int getContainer() {
        return container;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "steering='" + steering + '\'' +
                ", musicSystem='" + musicSystem + '\'' +
                ", airConditioner='" + airConditioner + '\'' +
                ", container=" + container +
                ", engine='" + getEngine() + '\'' +
                ", wheels=" + getWheels() +
                ", seats=" + getSeats() +
                ", fueltank='" + getFueltank() + '\'' +
                ", lights=" + getLights() +
                '}';
    }
}
