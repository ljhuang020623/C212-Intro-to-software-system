import org.junit.jupiter.api.Assertions;

class Lab04Test {

    @org.junit.jupiter.api.Test
    void containsMiddleABC() {
        Assertions.assertAll(
                () ->Assertions.assertTrue(Lab04.containsMiddleABC("ABC")),
                () ->Assertions.assertTrue(Lab04.containsMiddleABC("aABCc!")),
                () ->Assertions.assertTrue(Lab04.containsMiddleABC("notInTheMiddleABCmid!"))
        );
    }

    @org.junit.jupiter.api.Test
    void censor() {
        Assertions.assertAll(
                () -> Assertions.assertEquals("This is a **** sentence.", Lab04.censor("This is a test sentence.", "test")),
                () -> Assertions.assertEquals("*****", Lab04.censor("aaaaa", "a"))
        );
    }

    @org.junit.jupiter.api.Test
    void isSelfDividing() {
        Assertions.assertAll(
                () -> Assertions.assertTrue(Lab04.isSelfDividing(1)),
                () -> Assertions.assertTrue(Lab04.isSelfDividing(128)),
                () -> Assertions.assertFalse(Lab04.isSelfDividing(101))
        );
    }

    @org.junit.jupiter.api.Test
    void allSelfDividing() {
        Assertions.assertAll(
                () -> Assertions.assertTrue(Lab04.allSelfDividing(1)),
                () -> Assertions.assertTrue(Lab04.allSelfDividing(128)),
                () -> Assertions.assertFalse(Lab04.allSelfDividing(101))
        );
    }

    @org.junit.jupiter.api.Test
    void strSumNums(){
        Assertions.assertAll(
                () -> Assertions.assertEquals(100, Lab04.strSumNums("hello50how20are30you?")),
                () -> Assertions.assertEquals(10, Lab04.strSumNums("t1h1i1s1i1s1e1a1s1y1!")),
                () -> Assertions.assertEquals(0, Lab04.strSumNums("there are no numbers :(")),
                () -> Assertions.assertEquals(0, Lab04.strSumNums("still 0 just 0 zero0!"))
        );
    }

}