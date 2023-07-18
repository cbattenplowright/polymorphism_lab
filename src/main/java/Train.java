public class Train extends Vehicle {

    private int numberOfCarriages;

    public Train(String transportType, String manufacturer, int numberOfSeats, int maximumSpeed, boolean publicTransport, String travelType, int numberOfCarriages) {
        super(transportType, manufacturer, numberOfSeats, maximumSpeed, publicTransport, travelType);
        this.numberOfCarriages = numberOfCarriages;
    }

    public String move() {
        return "This train is moving";
    }

    public int getNumberOfCarriages(){
        return this.numberOfCarriages;
    }

    public void setNumberOfCarriages(int numberOfCarriages) {
        this.numberOfCarriages = numberOfCarriages;
    }
}
