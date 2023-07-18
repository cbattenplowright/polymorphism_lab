import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AeroplaneTest {

    private Aeroplane aeroplane;

    @BeforeEach
    public void setup() {
        aeroplane = new Aeroplane("Aeroplane", "Boeing", 456, 500, true, "Air", 50, 34000);
    }

    @Test
    public void canGetWingspan() {
        assertThat(aeroplane.getWingspan()).isEqualTo(50);
    }

    @Test
    public void canSetWingspan() {
        aeroplane.setWingspan(64);
        assertThat(aeroplane.getWingspan()).isEqualTo(64);
    }

    @Test
    public void canGetCruisingAltitude() {
        assertThat(aeroplane.getCruisingAltitude()).isEqualTo(34000);
    }

    @Test
    public void canSetCruisingAltitude() {
        aeroplane.setCruisingAltitude(38000);
        assertThat(aeroplane.getCruisingAltitude()).isEqualTo(38000);
    }
//
//    @Test
//    public void canMove(){
//        assertThat(aeroplane.move()).isEqualTo("This plane is moving");
//    }

    @Test
    public void canMove(){
        assertThat(aeroplane.move(aeroplane)).isEqualTo("This aeroplane is moving");
    }

}
