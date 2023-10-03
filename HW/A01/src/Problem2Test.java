import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @Test
    void problem2() {
            Assertions.assertAll(
                    () -> Assertions.assertEquals(12.5, Problem2.dewPoint(0.5, 23.5), 0.1),
                    () -> Assertions.assertEquals(11.3, Problem2.dewPoint(0.65, 18), 0.1),
                    () -> Assertions.assertEquals(32, Problem2.dewPoint(0.8, 36), 0.1)
            );
        }
}
