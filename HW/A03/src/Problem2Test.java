import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions;

class Problem2Test {

    @Test
    void peakFinder() {
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertArrayEquals(new int[]{13}, Problem2.peakFinder(new int[]{9,13,7,2,8}));
        }, () -> {
            Assertions.assertArrayEquals(new int[]{8}, Problem2.peakFinder(new int[]{8,7,8,7,8,7,8,7}));
        }, () -> {
            Assertions.assertArrayEquals(new int[]{84, 9}, Problem2.peakFinder(new int[]{111,27,84,31,5,9,4,3,2,1,64}));
        }, () -> {
            Assertions.assertArrayEquals(new int[]{}, Problem2.peakFinder(new int[]{}));
        }, () -> {
            Assertions.assertArrayEquals(new int[]{}, Problem2.peakFinder(new int[]{1}));
        }, () -> {
            Assertions.assertArrayEquals(new int[]{}, Problem2.peakFinder(new int[]{1,2}));
        }, () -> {
            Assertions.assertArrayEquals(new int[]{2}, Problem2.peakFinder(new int[]{1,2,1}));
        }, () -> {
            Assertions.assertArrayEquals(new int[]{3}, Problem2.peakFinder(new int[]{1,2,3,2,1}));
        },});
    }
}