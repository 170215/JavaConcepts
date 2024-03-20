package OOPS.inheritance.Demo1;

public class Car extends vehicle {

    private String steering;

    private String musicSystem;

    private String airConditioner;

    private String fridge;

    private String entertainment_System;

    public Car(String engine, int wheels, int seats, String fueltank, int lights, String steering, String musicSystem, String airConditioner, String fridge, String entertainment_System) {
        super(engine, wheels, seats, fueltank, lights);
        this.steering = steering;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.fridge = fridge;
        this.entertainment_System = entertainment_System;
    }

    public Car(String steering, String musicSystem, String airConditioner, String fridge, String entertainment_System) {
        this.steering = steering;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.fridge = fridge;
        this.entertainment_System = entertainment_System;
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

    public String getFridge() {
        return fridge;
    }

    public String getEntertainment_System() {
        return entertainment_System;
    }

    @Override
    public String toString() {
        return "Car{" +
                "steering='" + steering + '\'' +
                ", musicSystem='" + musicSystem + '\'' +
                ", airConditioner='" + airConditioner + '\'' +
                ", fridge='" + fridge + '\'' +
                ", entertainment_System='" + entertainment_System + '\'' +
                ", engine='" + getEngine() + '\'' +
                ", wheels=" + getWheels() +
                ", seats=" + getSeats() +
                ", fueltank='" + getFueltank() + '\'' +
                ", lights=" + getLights() +
                '}';
    }
}
