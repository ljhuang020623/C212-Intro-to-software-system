import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lab03Test {

    @org.junit.jupiter.api.Test
    void countStr() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(2, Lab03.countStr("strNistr")),
                () ->Assertions.assertEquals(3, Lab03.countStr("strstrstr")),
                () ->Assertions.assertEquals(1, Lab03.countStr("stroun"))
        );

    }

    @Test
    void countStrTR() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(2, Lab03.countStrTR("strNistr")),
                () ->Assertions.assertEquals(3, Lab03.countStrTR("strstrstr")),
                () ->Assertions.assertEquals(1, Lab03.countStrTR("stroun"))
        );
    }

    @Test
    void replaceAB() {
        Assertions.assertAll(
                () ->Assertions.assertEquals("BrtWork", Lab03.replaceAB("ArtWork")),
                () ->Assertions.assertEquals("Bnimal", Lab03.replaceAB("Animal")),
                () ->Assertions.assertEquals("BrBBBB", Lab03.replaceAB("ArABAA"))
        );
    }

    @Test
    void replaceABTR() {
        Assertions.assertAll(
                () ->Assertions.assertEquals("BrtWork", Lab03.replaceABTR("ArtWork")),
                () ->Assertions.assertEquals("Bnimal", Lab03.replaceABTR("Animal")),
                () ->Assertions.assertEquals("BrBBBB", Lab03.replaceABTR("ArABAA"))
        );
    }

    @Test
    void countElephantEars() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(6, Lab03.countElephantEars(3)),
                () ->Assertions.assertEquals(20, Lab03.countElephantEars(10)),
                () ->Assertions.assertEquals(308, Lab03.countElephantEars(154))
        );
    }

    @Test
    void countElephantEarsTR() {
        Assertions.assertAll(
                () ->Assertions.assertEquals(6, Lab03.countElephantEarsTR(3)),
                () ->Assertions.assertEquals(20, Lab03.countElephantEarsTR(10)),
                () ->Assertions.assertEquals(308, Lab03.countElephantEarsTR(154))
        );
    }
}