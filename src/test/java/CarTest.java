import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private Car car;

    @BeforeEach
    public void setup(){
        car = new Car("McLaren", 2, 183, false, "Land", 2, true, "Diesel");
    }

    @Test
    public void canGetManufacturer(){
        assertThat(car.getManufacturer()).isEqualTo("McLaren");
    }

    @Test
    public void canGetNumberOfSeats(){
        assertThat(car.getNumberOfSeats()).isEqualTo(2);
    }

    @Test
    public void canGetMaximumSpeed(){
        assertThat(car.getMaximumSpeed()).isEqualTo(183);
    }

    @Test
    public void canGetPublicTransport(){
        assertThat(car.getPublicTransport()).isEqualTo(false);
    }

    @Test
    public void canGetTravelType(){
        assertThat(car.getTravelType()).isEqualTo("Land");
    }

    @Test
    public void canGetNumberOfDoors() {
        assertThat(car.getNumberOfDoors()).isEqualTo(2);
    }

    @Test
    public void canGetIsRadioOn() {
        assertThat(car.getRadioOn()).isEqualTo(true);
    }

    @Test
    public void canGetEngineType() {
        assertThat(car.getEngineType()).isEqualTo("Diesel");
    }

}
