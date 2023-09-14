import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    void problem4() {
        Assertions.assertAll(
                () ->Assertions.assertEquals("April 15, 2001", Problem4.stringifyDate(2001))
        );
    }
}
