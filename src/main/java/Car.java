public class Car extends Vehicle {

    private int numberOfDoors;
    private boolean radioOn;
    private EngineType engineType;


    private enum EngineType {
        Petrol,
        Diesel,
        Hybrid,
        Electric
    }

    public Car(String transportType, String manufacturer, int numberOfSeats, int maximumSpeed, boolean publicTransport, String travelType, int numberOfDoors, boolean radioOn, String engineType) {
        super(transportType, manufacturer, numberOfSeats, maximumSpeed, publicTransport, travelType);
        this.numberOfDoors = numberOfDoors;
        this.radioOn = radioOn;
        this.engineType = EngineType.valueOf(engineType);
    }

    public String makeSound() {
        return "Vroom!";
    }

    public String move() {
        return "This car is moving";
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    public boolean getRadioOn() {
        return this.radioOn;
    }

    public String getEngineType() {
        return this.engineType.toString();
    }

    public String start(Key key) {
        return "This car was started with a key";
    }

    public String start(PushButton pushButton) {
        return "This car was started with a button";
    }

    public String start(RemoteControl remoteControl) {
        return "This car was started with a remote control";
    }

}
