public class Car extends Vehicle{

    private int numberOfDoors;
    private boolean radioOn;
    private EngineType engineType;

    private enum EngineType {
        Petrol,
        Diesel,
        Hybrid,
        Electric
    }

    public Car(String manufacturer, int numberOfSeats, int maximumSpeed, boolean publicTransport, String travelType, int numberOfDoors, boolean radioOn, String engineType) {
        super(manufacturer, numberOfSeats, maximumSpeed, publicTransport, travelType);
        this.numberOfDoors = numberOfDoors;
        this.radioOn = radioOn;
        this.engineType = EngineType.valueOf(engineType);
    }

    @Override
    public void move() {
        System.out.println("The car is moving");
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

}
