import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void problem3() {
        Assertions.assertAll(
                () ->Assertions.assertEquals("January", Problem3.numberToMonth(1)),
                () ->Assertions.assertEquals("March", Problem3.numberToMonth(3)),
                () ->Assertions.assertEquals("December", Problem3.numberToMonth(12))
        );
    }
}
