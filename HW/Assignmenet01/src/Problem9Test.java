import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem9Test {

    @Test
    void fitCandy() {
        {
            Assertions.assertAll(
                    () ->Assertions.assertEquals(4, Problem9.fitCandy(4,1,4)),
                    () ->Assertions.assertEquals(1, Problem9.fitCandy(1,2,6)),
                    () ->Assertions.assertEquals(-1, Problem9.fitCandy(6,1,13)),
                    () ->Assertions.assertEquals(50, Problem9.fitCandy(60,100,550)),
                    () ->Assertions.assertEquals(7, Problem9.fitCandy(7,1,12)),
                    () ->Assertions.assertEquals(4, Problem9.fitCandy(4,1,9))
            );
        }
    }
}