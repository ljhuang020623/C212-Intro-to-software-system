import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem1Test {

    @Test
    void Problem1() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(14.63, Problem1.purchase(2, 5, 10)),
                () ->Assertions.assertEquals(45.93, Problem1.purchase(3, 10, 64)),
                () ->Assertions.assertEquals(24.9, Problem1.purchase(15,9,0))
        );
    }
}