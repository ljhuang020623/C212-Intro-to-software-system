import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void isPalindromeTR() {
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertTrue(Problem3.isPalindromeTR("racecar"));
        }, () -> {
            Assertions.assertFalse(Problem3.isPalindromeTR("blank"));
        }, () -> {
            Assertions.assertTrue(Problem3.isPalindromeTR("tenet"));
        }, () -> {
            Assertions.assertTrue(Problem3.isPalindromeTR("deed"));
        }, () -> {
            Assertions.assertFalse(Problem3.isPalindromeTR("minute"));
        }, () -> {
            Assertions.assertTrue(Problem3.isPalindromeTR("level"));
        }});
    }

    @Test
    void isPalindromeLoop() {
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertTrue(Problem3.isPalindromeLoop("racecar"));
        }, () -> {
            Assertions.assertFalse(Problem3.isPalindromeLoop("blank"));
        }, () -> {
            Assertions.assertTrue(Problem3.isPalindromeLoop("tenet"));
        }, () -> {
            Assertions.assertTrue(Problem3.isPalindromeLoop("deed"));
        }, () -> {
            Assertions.assertFalse(Problem3.isPalindromeLoop("minute"));
        }, () -> {
            Assertions.assertTrue(Problem3.isPalindromeLoop("level"));
        }});
    }
}