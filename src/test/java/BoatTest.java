import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BoatTest {

    private Boat boat;

    @BeforeEach
    public void setup() {
        boat = new Boat("Osprey", 6, 57, false, "Sea", 45);
    }

    @Test
    public void canGetLengthOverall() {
        assertThat(boat.getLengthOverall()).isEqualTo(45);
    }

    @Test
    public void canSetLengthOverall() {
        boat.setLengthOverall(60);
        assertThat(boat.getLengthOverall()).isEqualTo(60);
    }
}
