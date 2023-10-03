import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class Problem6Test {

    @Test
    void parenthesesDepth() {
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertEquals(0, Problem6.parenthesesDepth("()"));
        }, () -> {
            Assertions.assertEquals(0, Problem6.parenthesesDepth("(())"));
        }, () -> {
            Assertions.assertEquals(0, Problem6.parenthesesDepth("(()())"));
        }, () -> {
            Assertions.assertEquals(-5, Problem6.parenthesesDepth(")))))"));
        }, () -> {
            Assertions.assertEquals(5, Problem6.parenthesesDepth("((((("));
        }, () -> {
            Assertions.assertEquals(-2, Problem6.parenthesesDepth("((())()))))(()"));
        }, () -> {
            Assertions.assertEquals(0, Problem6.parenthesesDepth("(()(())((())(())))"));
        }});
    }

    @Test
    void parenthesesDepthTR() {
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertEquals(0, Problem6.parenthesesDepthTR("()"));
        }, () -> {
            Assertions.assertEquals(0, Problem6.parenthesesDepthTR("(())"));
        }, () -> {
            Assertions.assertEquals(0, Problem6.parenthesesDepthTR("(()())"));
        }, () -> {
            Assertions.assertEquals(-5, Problem6.parenthesesDepthTR(")))))"));
        }, () -> {
            Assertions.assertEquals(5, Problem6.parenthesesDepthTR("((((("));
        }, () -> {
            Assertions.assertEquals(-2, Problem6.parenthesesDepthTR("((())()))))(()"));
        }, () -> {
            Assertions.assertEquals(0, Problem6.parenthesesDepthTR("(()(())((())(())))"));
        }});
    }

    @Test
    void parenthesesDepthLoop() {
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertEquals(0, Problem6.parenthesesDepthLoop("()"));
        }, () -> {
            Assertions.assertEquals(0, Problem6.parenthesesDepthLoop("(())"));
        }, () -> {
            Assertions.assertEquals(0, Problem6.parenthesesDepthLoop("(()())"));
        }, () -> {
            Assertions.assertEquals(-5, Problem6.parenthesesDepthLoop(")))))"));
        }, () -> {
            Assertions.assertEquals(5, Problem6.parenthesesDepthLoop("((((("));
        }, () -> {
            Assertions.assertEquals(-2, Problem6.parenthesesDepthLoop("((())()))))(()"));
        }, () -> {
            Assertions.assertEquals(0, Problem6.parenthesesDepthLoop("(()(())((())(())))"));
        }});
    }
}