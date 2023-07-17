import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AeroplaneTest {

    private Aeroplane aeroplane;

    @BeforeEach
    public void setup() {
        aeroplane = new Aeroplane("Boeing", 456, 500, true, "Air", 50, 34000);
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

}
