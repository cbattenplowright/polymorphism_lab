import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private Car car;

    @BeforeEach
    public void setup() {
        car = new Car("Car", "McLaren", 2, 183, false, "Land", 2, true, "Diesel");
    }

    @Test
    public void canMove() {
        assertThat(car.move()).isEqualTo("This car is moving");
    }

    @Test
    public void canStartCarWithKey() {
        assertThat(car.start(new Key("mclaren"))).isEqualTo("This car was started with a key");
    }

    @Test
    public void canStartCarWithPushButton() {
        assertThat(car.start(new PushButton("Toyota"))).isEqualTo("This car was started with a button");
    }

    @Test
    public void canStartCarWithRemoteControl() {
        assertThat(car.start(new RemoteControl("Samsung"))).isEqualTo("This car was started with a remote control");
    }

    @Test
    public void canMakeSound(){
        assertThat(car.makeSound()).isEqualTo("Vroom!");
    }

//    GETTER AND SETTER TESTS

    @Test
    public void canGetManufacturer() {
        assertThat(car.getManufacturer()).isEqualTo("McLaren");
    }

    @Test
    public void canGetNumberOfSeats() {
        assertThat(car.getNumberOfSeats()).isEqualTo(2);
    }

    @Test
    public void canGetMaximumSpeed() {
        assertThat(car.getMaximumSpeed()).isEqualTo(183);
    }

    @Test
    public void canGetPublicTransport() {
        assertThat(car.getPublicTransport()).isEqualTo(false);
    }

    @Test
    public void canGetTravelType() {
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

    @Test
    public void canSetManufacturer() {
        car.setManufacturer("Jaguar");
        assertThat(car.getManufacturer()).isEqualTo("Jaguar");
    }

    @Test
    public void canSetNumberOfSeats() {
        car.setNumberOfSeats(4);
        assertThat(car.getNumberOfSeats()).isEqualTo(4);
    }

    @Test
    public void canSetMaximumSpeed() {
        car.setMaximumSpeed(200);
        assertThat(car.getMaximumSpeed()).isEqualTo(200);
    }

    @Test
    public void canSetPublicTransport() {
        car.setPublicTransport(true);
        assertThat(car.getPublicTransport()).isEqualTo(true);
    }

    @Test
    public void canSetTravelType() {
        car.setTravelType("Air");
        assertThat(car.getTravelType()).isEqualTo("Air");
    }
}
