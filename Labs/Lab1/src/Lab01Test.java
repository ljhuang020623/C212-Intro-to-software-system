import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Lab01Test {
    @Test
    void celsiusToFahrenheit() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(32, Lab01.celsiusToFahrenheit(0), 0.01),
                () ->Assertions.assertEquals(212, Lab01.celsiusToFahrenheit(100), 0.01),
                () ->Assertions.assertEquals(122, Lab01.celsiusToFahrenheit(50), 0.01)
        );
    }
    @Test
    void billTotal() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(128.1, Lab01.billTotal(100), 0.01),
                () ->Assertions.assertEquals(256.2, Lab01.billTotal(200), 0.01),
                () ->Assertions.assertEquals(1281, Lab01.billTotal(1000), 0.01)
        );
    }
    @Test
    void pointDistance() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(3.16, Lab01.pointDistance(3, 1, 2, 4), 0.01),
                () ->Assertions.assertEquals(5.65, Lab01.pointDistance(4, 6, 8, 10), 0.01),
                () ->Assertions.assertEquals(14.14, Lab01.pointDistance(0,0, 10, 10), 0.01)
        );
    }
    @Test
    void sumOfSquares() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(8, Lab01.sumOfSquares(2, 2)),
                () ->Assertions.assertEquals(490, Lab01.sumOfSquares(7, 21)),
                () ->Assertions.assertEquals(25, Lab01.sumOfSquares(3, 4))
        );
    }
}