import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RobotTest {

    private Robot robot;

    @BeforeEach
    public void setup() {
        robot = new Robot("WALL-EE", "Waste Collector");
    }

    @Test
    public void canMove() {
        assertThat(robot.move()).isEqualTo("Weee WALL-EE is moving!");
    }

}
