import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    @org.junit.jupiter.api.Test
    void fibonacci() {
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertEquals(1, Problem1.fibonacci(1));
        }, () -> {
            Assertions.assertEquals(55, Problem1.fibonacci(10));
        }, () -> {
            Assertions.assertEquals(832040, Problem1.fibonacci(30));
        }});
    }
    @org.junit.jupiter.api.Test
    void fibonacciTR() {
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertEquals(1, Problem1.fibonacciTR(1));
        }, () -> {
            Assertions.assertEquals(55, Problem1.fibonacciTR(10));
        }, () -> {
            Assertions.assertEquals(832040, Problem1.fibonacciTR(30));
        }});
    }

    @org.junit.jupiter.api.Test
    void fibonacciLoop() {
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertEquals(1, Problem1.fibonacciLoop(1));
        }, () -> {
            Assertions.assertEquals(55, Problem1.fibonacciLoop(10));
        }, () -> {
            Assertions.assertEquals(832040, Problem1.fibonacciLoop(30));
        }});
    }
}