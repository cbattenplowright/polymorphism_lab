import Interfaces.IMove;

public abstract class Vehicle implements IMove {

    protected String manufacturer;
    protected int numberOfSeats;
    protected int maximumSpeed;
    protected boolean publicTransport;
    protected TravelType travelType;
    protected TransportType transportType;

    public enum TravelType {
        Land,
        Air,
        Sea
    }

    public enum TransportType {
        Car,
        Train,
        Aeroplane,
        Boat
    }

    public Vehicle(String transportType, String manufacturer, int numberOfSeats, int maximumSpeed, boolean publicTransport, String travelType) {
        this.transportType = TransportType.valueOf(transportType);
        this.manufacturer = manufacturer;
        this.numberOfSeats = numberOfSeats;
        this.maximumSpeed = maximumSpeed;
        this.publicTransport = publicTransport;
        this.travelType = TravelType.valueOf(travelType);
    }

    public abstract String makeSound();

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
