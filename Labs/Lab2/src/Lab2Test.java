import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lab2Test {

    @org.junit.jupiter.api.Test
    void problem1() {
        Assertions.assertAll(
                () ->Assertions.assertEquals("gas", Lab2.Problem1(101,'C')),
                () ->Assertions.assertEquals("solid", Lab2.Problem1(31,'F')),
                () ->Assertions.assertEquals("liquid", Lab2.Problem1(200,'F'))
        );
}


    @Test
    void problem2() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(4, Lab2.Problem2("A","+")),
                () ->Assertions.assertEquals(0, Lab2.Problem2("F","-")),
                () ->Assertions.assertEquals(1.3, Lab2.Problem2("D","+"))
        );
    }

    @Test
    void problem3() {
        Assertions.assertAll(
                () ->Assertions.assertEquals("Able,Baker,Charlie", Lab2.Problem3("Able", "Baker", "Charlie")),
                () ->Assertions.assertEquals("Betty,Diana,Kate", Lab2.Problem3("Kate", "Betty", "Diana")),
                () ->Assertions.assertEquals("Bob,Jake,Lauren", Lab2.Problem3("Bob","Jake", "Lauren"))
        );
    }

    @Test
    void problem4() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(true, Lab2.Problem4(2024)),
                () ->Assertions.assertEquals(true, Lab2.Problem4(2568)),
                () ->Assertions.assertEquals(false, Lab2.Problem4(1990))
        );
    }

}