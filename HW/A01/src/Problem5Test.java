import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem5Test {

    @Test
    void problem5() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(true, Problem5.isEvenlySpaced(4, 5, 6)),
                () ->Assertions.assertEquals(false, Problem5.isEvenlySpaced(10, 25, -10)),
                () ->Assertions.assertEquals(true, Problem5.isEvenlySpaced(0, 25, -25))
        );
    }
}
