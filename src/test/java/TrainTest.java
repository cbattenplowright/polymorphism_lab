import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TrainTest {

    private Train train;

    @BeforeEach
    public void setup() {
        train = new Train("Bombardier", 123, 250, true, "Land", 6);
    }

    @Test
    public void canGetNumberOfCarriages(){
        assertThat(train.getNumberOfCarriages()).isEqualTo(6);
    }

    @Test
    public void canSetNumberOfCarriages(){
        train.setNumberOfCarriages(4);
        assertThat(train.getNumberOfCarriages()).isEqualTo(4);
    }
}
