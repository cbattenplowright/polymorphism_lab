public abstract class Vehicle {

    protected String manufacturer;
    protected int numberOfSeats;
    protected int maximumSpeed;
    protected boolean publicTransport;
    protected TravelType travelType;


    public enum TravelType {
        Land,
        Air,
        Sea,
    }

    public Vehicle(String manufacturer, int numberOfSeats, int maximumSpeed, boolean publicTransport, String travelType) {
        this.manufacturer = manufacturer;
        this.numberOfSeats = numberOfSeats;
        this.maximumSpeed = maximumSpeed;
        this.publicTransport = publicTransport;
        this.travelType = TravelType.valueOf(travelType);
    }

    public abstract void move(); // Indicates it is an abstract method. Implementation is left to the subclasses of Vehicle

//    GETTERS AND SETTERS

    public String getManufacturer() {
        return this.manufacturer;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public int getMaximumSpeed() {
        return this.maximumSpeed;
    }

    public boolean getPublicTransport() {
        return this.publicTransport;
    }

    public String getTravelType(){
        return this.travelType.toString(); // returns and converts the enum value to String
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setNumberOfSeats(int amount) {
        this.numberOfSeats = amount;
    }

    public void setMaximumSpeed(int speed) {
        this.maximumSpeed = speed;
    }

    public void setPublicTransport(boolean publicTransport) {
        this.publicTransport = publicTransport;
    }

    public void setTravelType(String travelType){
        this.travelType = TravelType.valueOf(travelType);
    }
}
