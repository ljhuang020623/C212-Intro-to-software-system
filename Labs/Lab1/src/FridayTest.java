import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FridayTest {
    @Test
    void celsiusToFahrenheit() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(32, Friday.celsiusToFahrenheit(0), 0.01),
                () ->Assertions.assertEquals(212, Friday.celsiusToFahrenheit(100), 0.01),
                () ->Assertions.assertEquals(122, Friday.celsiusToFahrenheit(50), 0.01)
        );
    }
    @Test
    void billTotal() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(128.1, Friday.billTotal(100), 0.01),
                () ->Assertions.assertEquals(256.2, Friday.billTotal(200), 0.01),
                () ->Assertions.assertEquals(1281, Friday.billTotal(1000), 0.01)
        );
    }
    @Test
    void pointDistance() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(3.16, Friday.pointDistance(3, 1, 2, 4), 0.01),
                () ->Assertions.assertEquals(5.65, Friday.pointDistance(4, 6, 8, 10), 0.01),
                () ->Assertions.assertEquals(14.14, Friday.pointDistance(0,0, 10, 10), 0.01)
        );
    }
    @Test
    void sumOfSquares() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(8, Friday.sumOfSquares(2, 2)),
                () ->Assertions.assertEquals(490, Friday.sumOfSquares(7, 21)),
                () ->Assertions.assertEquals(25, Friday.sumOfSquares(3, 4))
        );
    }
}