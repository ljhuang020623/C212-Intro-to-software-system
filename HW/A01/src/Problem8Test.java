import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem8Test {

    @Test
    void isInsideCircle() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(true, Problem8.isInsideCircle(0,0,5,3,4)),
                () ->Assertions.assertEquals(true, Problem8.isInsideCircle(-2,1,2.5,-1,0)),
                () ->Assertions.assertEquals(false, Problem8.isInsideCircle(1,1,2,3,1))
        );
    }

    @Test
    void isInsideRectangle() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(true, Problem8.isInsideRectangle(0,0,5,3,3,2)),
                () ->Assertions.assertEquals(false, Problem8.isInsideRectangle(-2,-2,4,3,-4,0)),
                () ->Assertions.assertEquals(false, Problem8.isInsideRectangle(1,1,4,4,1,3))
        );
    }
}