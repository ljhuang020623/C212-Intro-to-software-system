import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @Test
    void isPrimeTR() {
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertFalse(Problem2.isPrimeTR(0));
        }, () -> {
            Assertions.assertFalse(Problem2.isPrimeTR(1));
        }, () -> {
            Assertions.assertTrue(Problem2.isPrimeTR(2));
        }, () -> {
            Assertions.assertFalse(Problem2.isPrimeTR(57));
        }, () -> {
            Assertions.assertFalse(Problem2.isPrimeTR(100));
        }, () -> {
            Assertions.assertTrue(Problem2.isPrimeTR(257));
        }, () -> {
            Assertions.assertTrue(Problem2.isPrimeTR(97));
        }});
    }

    @Test
    void isPrimeLoop() {
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertFalse(Problem2.isPrimeLoop(0));
        }, () -> {
            Assertions.assertFalse(Problem2.isPrimeLoop(1));
        }, () -> {
            Assertions.assertTrue(Problem2.isPrimeLoop(2));
        }, () -> {
            Assertions.assertFalse(Problem2.isPrimeLoop(57));
        }, () -> {
            Assertions.assertFalse(Problem2.isPrimeLoop(100));
        }, () -> {
            Assertions.assertTrue(Problem2.isPrimeLoop(257));
        }, () -> {
            Assertions.assertTrue(Problem2.isPrimeLoop(97));
        }});
    }
}