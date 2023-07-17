public class Train extends Vehicle {

    private int numberOfCarriages;

    public Train(String manufacturer, int numberOfSeats, int maximumSpeed, boolean publicTransport, String travelType, int numberOfCarriages) {
        super(manufacturer, numberOfSeats, maximumSpeed, publicTransport, travelType);
        this.numberOfCarriages = numberOfCarriages;
    }

    @Override
    public void move() {
        System.out.println("The train is moving");
    }

    public int getNumberOfCarriages(){
        return this.numberOfCarriages;
    }

    public void setNumberOfCarriages(int numberOfCarriages) {
        this.numberOfCarriages = numberOfCarriages;
    }
}
