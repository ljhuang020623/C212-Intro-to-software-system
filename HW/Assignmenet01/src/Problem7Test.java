import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem7Test {

    @Test
    void quadraticRoots() {
        Assertions.assertAll(
                () ->Assertions.assertEquals("x1=2.000000 x2=1.000000", Problem7.quadraticRoots(1, -3, 2)),
                () ->Assertions.assertEquals("x=-1.000000", Problem7.quadraticRoots(2, 4, 2))
        );
    }
}