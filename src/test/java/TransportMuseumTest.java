import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TransportMuseumTest {

    private TransportMuseum transportMuseum;
    private Car maserati;
    private Train scotsman;
    private Aeroplane boeing;
    private Boat searib;

    @BeforeEach
    public void setup() {
        maserati = new Car("Car", "Maserati", 2, 179, false, "Land", 2, false, "Diesel");
        scotsman = new Train("Train", "Doncaster Works", 245, 125, true, "Land", 12);
        boeing = new Aeroplane("Aeroplane", "Airbus", 456, 500, true, "Air", 50, 35000);
        searib = new Boat("Boat", "Osprey", 6, 57, false, "Sea", 45);
        transportMuseum = new TransportMuseum("British Transport Museum");
        transportMuseum.addVehicle(maserati);
        transportMuseum.addVehicle(scotsman);
        transportMuseum.addVehicle(boeing);
        transportMuseum.addVehicle(searib);
    }

    @Test
    public void canGetName() {
        assertThat(transportMuseum.getName()).isEqualTo("British Transport Museum");
    }

    @Test
    public void canSetName() {
        transportMuseum.setName("Goodwood");
        assertThat(transportMuseum.getName()).isEqualTo("Goodwood");
    }

    @Test
    public void canAddVehicle() {
        Car mclaren = new Car("Car", "McLaren", 2, 183, false, "Land", 2, true, "Diesel");
        assertThat(transportMuseum.vehicleCount()).isEqualTo(4);
        transportMuseum.addVehicle(mclaren);
        assertThat(transportMuseum.vehicleCount()).isEqualTo(5);
    }

    @Test
    public void canRemoveVehicle() {
        assertThat(transportMuseum.isVehicleInCollection(maserati)).isEqualTo(true);
        transportMuseum.removeVehicle(maserati);
        assertThat(transportMuseum.isVehicleInCollection(maserati)).isEqualTo(false);
    }

}
