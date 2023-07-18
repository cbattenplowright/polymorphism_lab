public class Aeroplane extends Vehicle {

    private int wingspan;
    private int cruisingAltitude;

    public Aeroplane(String transportType, String manufacturer, int numberOfSeats, int maximumSpeed, boolean publicTransport, String travelType, int wingspan, int cruisingAltitude) {
        super(transportType, manufacturer, numberOfSeats, maximumSpeed, publicTransport, travelType);
        this.wingspan = wingspan;
        this.cruisingAltitude = cruisingAltitude;
    }

    public String makeSound() {
        return "Whoosh!";
    }

    public String move() {
        return "This aeroplane is moving";
    }


//    GETTERS AND SETTERS

    public int getWingspan() {
        return this.wingspan;
    }

    public int getCruisingAltitude() {
        return this.cruisingAltitude;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public void setCruisingAltitude(int cruisingAltitude) {
        this.cruisingAltitude = cruisingAltitude;
    }
}
