import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    void isNestedParenthesesTR() {
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertTrue(Problem4.isNestedParenthesesTR("()"));
        }, () -> {
            Assertions.assertFalse(Problem4.isNestedParenthesesTR("())"));
        }, () -> {
            Assertions.assertFalse(Problem4.isNestedParenthesesTR("(()))"));
        }, () -> {
            Assertions.assertTrue(Problem4.isNestedParenthesesTR("((()))"));
        }, () -> {
            Assertions.assertTrue(Problem4.isNestedParenthesesTR("(((())))"));
        }, () -> {
            Assertions.assertFalse(Problem4.isNestedParenthesesTR("()))))"));
        }});
    }

    @Test
    void isNestedParenthesesLoop() {
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertTrue(Problem4.isNestedParenthesesLoop("()"));
        }, () -> {
            Assertions.assertFalse(Problem4.isNestedParenthesesLoop("())"));
        }, () -> {
            Assertions.assertFalse(Problem4.isNestedParenthesesLoop("(()))"));
        }, () -> {
            Assertions.assertTrue(Problem4.isNestedParenthesesLoop("((()))"));
        }, () -> {
            Assertions.assertTrue(Problem4.isNestedParenthesesLoop("(((())))"));
        }, () -> {
            Assertions.assertFalse(Problem4.isNestedParenthesesLoop("()))))"));
        }});
    }
}