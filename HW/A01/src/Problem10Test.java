import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem10Test {

    @Test
    void isValidIpv4() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(true, Problem10.isValidIpv4("192.168.1.244")),
                () ->Assertions.assertEquals(true, Problem10.isValidIpv4("149.165.192.52")),
                () ->Assertions.assertEquals(false, Problem10.isValidIpv4("192.168.1.256")),
                () ->Assertions.assertEquals(false, Problem10.isValidIpv4("192.168.1201.23")),
                () ->Assertions.assertEquals(false, Problem10.isValidIpv4("192.168.1201.ABC")),
                () ->Assertions.assertEquals(false, Problem10.isValidIpv4("ABC.DEF.GHI")),
                () ->Assertions.assertEquals(false, Problem10.isValidIpv4("192.168.1A6.201"))
        );
    }
}