import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class Problem5Test {

    @Test
    void collatz() {
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertEquals("5,16,8,4,2,1", Problem5.collatz(5));
        }, () -> {
            Assertions.assertEquals("1", Problem5.collatz(1));
        }, () -> {
            Assertions.assertEquals("6,3,10,5,16,8,4,2,1", Problem5.collatz(6));
        }, () -> {
            Assertions.assertEquals("7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1", Problem5.collatz(7));
        }, () -> {
            Assertions.assertEquals("12,6,3,10,5,16,8,4,2,1", Problem5.collatz(12));
        }, () -> {
            Assertions.assertEquals("19,58,29,88,44,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1", Problem5.collatz(19));
        }});
    }

    @Test
    void collatzTR() {
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertEquals("5,16,8,4,2,1", Problem5.collatzTR(5));
        }, () -> {
            Assertions.assertEquals("1", Problem5.collatzTR(1));
        }, () -> {
            Assertions.assertEquals("6,3,10,5,16,8,4,2,1", Problem5.collatzTR(6));
        }, () -> {
            Assertions.assertEquals("7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1", Problem5.collatzTR(7));
        }, () -> {
            Assertions.assertEquals("12,6,3,10,5,16,8,4,2,1", Problem5.collatzTR(12));
        }, () -> {
            Assertions.assertEquals("19,58,29,88,44,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1", Problem5.collatzTR(19));
        }});
    }

    @Test
    void collatzLoop(){
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertEquals("5,16,8,4,2,1", Problem5.collatzLoop(5));
        }, () -> {
            Assertions.assertEquals("1", Problem5.collatzLoop(1));
        }, () -> {
            Assertions.assertEquals("6,3,10,5,16,8,4,2,1", Problem5.collatzLoop(6));
        }, () -> {
            Assertions.assertEquals("7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1", Problem5.collatzLoop(7));
        }, () -> {
            Assertions.assertEquals("12,6,3,10,5,16,8,4,2,1", Problem5.collatzLoop(12));
        }, () -> {
            Assertions.assertEquals("19,58,29,88,44,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1", Problem5.collatzLoop(19));
        }});
    }
}