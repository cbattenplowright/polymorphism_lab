public class Boat extends Vehicle {

    private int lengthOverall;

    public Boat(String transportType, String manufacturer, int numberOfSeats, int maximumSpeed, boolean publicTransport, String travelType, int lengthOverall) {
        super(transportType, manufacturer, numberOfSeats, maximumSpeed, publicTransport, travelType);
        this.lengthOverall = lengthOverall;
    }

    public String move() {
        return "This boat is moving";
    }

//    GETTERS AND SETTERS

    public int getLengthOverall() {
        return this.lengthOverall;
    }

    public void setLengthOverall(int lengthOverall) {
        this.lengthOverall = lengthOverall;
    }
}
