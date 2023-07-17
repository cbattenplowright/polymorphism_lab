public class Boat extends Vehicle {

    private int lengthOverall;

    public Boat(String manufacturer, int numberOfSeats, int maximumSpeed, boolean publicTransport, String travelType, int lengthOverall) {
        super(manufacturer, numberOfSeats, maximumSpeed, publicTransport, travelType);
        this.lengthOverall = lengthOverall;
    }

    @Override
    public void move() {
        System.out.println("The boat is moving");
    }

//    GETTERS AND SETTERS

    public int getLengthOverall() {
        return this.lengthOverall;
    }

    public void setLengthOverall(int lengthOverall) {
        this.lengthOverall = lengthOverall;
    }
}
