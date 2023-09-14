import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem6Test {
    @Test
    void and() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(false, Problem6.and(true, false)),
                () ->Assertions.assertEquals(false, Problem6.and(false, false))
        );
    }
    @Test
    void or() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(true, Problem6.or(true, false)),
                () ->Assertions.assertEquals(false, Problem6.or(false, false))
        );
    }

    @Test
    void not() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(false, Problem6.not(true)),
                () ->Assertions.assertEquals(true, Problem6.not(false))
        );
    }
    @Test
    void cond() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(false, Problem6.cond(true, false)),
                () ->Assertions.assertEquals(true, Problem6.cond(false, false))
        );
    }

    @Test
    void biCond() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(false, Problem6.bicond(true, false)),
                () ->Assertions.assertEquals(true, Problem6.bicond(false, false))
        );
    }

    @Test
    void test1() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(true, Problem6.test1(false, true, false))
        );
    }

    @Test
    void test2() {
        Assertions.assertAll(
            () ->Assertions.assertEquals(false, Problem6.test2(true, false, true))
        );
    }
}