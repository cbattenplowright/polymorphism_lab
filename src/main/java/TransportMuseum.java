import java.util.ArrayList;

public class TransportMuseum {

    private String name;
    private ArrayList<Vehicle> vehicleCollection;

    public TransportMuseum(String name) {
        this.name = name;
        this.vehicleCollection = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicleCollection.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehicleCollection.remove(vehicle);
    }

    public boolean isVehicleInCollection(Vehicle vehicle) {
        return vehicleCollection.contains(vehicle);
    }

    public int vehicleCount() {
        return this.vehicleCollection.size();
    }

//    GETTERS AND SETTERS

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
