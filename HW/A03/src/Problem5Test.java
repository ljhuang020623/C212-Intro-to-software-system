import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Arrays;
class Problem5Test {

    @Test
    void addLast() {
        Assertions.assertAll(
                () -> {
                    LinkedList<Integer> original = new LinkedList<>(Arrays.asList(1, 2, 3));
                    LinkedList<Integer> result = Problem5.addLast(original, 4);
                    Assertions.assertEquals(Arrays.asList(1, 2, 3, 4), result);
                },
                () -> {
                    LinkedList<Integer> original = new LinkedList<>();
                    LinkedList<Integer> result = Problem5.addLast(original, 5);
                    Assertions.assertEquals(Arrays.asList(5), result);
                },
                () -> {
                    LinkedList<Integer> original = new LinkedList<>(Arrays.asList(1));
                    LinkedList<Integer> result = Problem5.addLast(original, 2);
                    result = Problem5.addLast(result, 3);
                    Assertions.assertEquals(Arrays.asList(1, 2, 3), result);
                }
        );
    }

    @Test
    void set() {
        Assertions.assertAll(
                () -> {
                    LinkedList<Integer> original = new LinkedList<>(Arrays.asList(1, 2, 3));
                    LinkedList<Integer> result = Problem5.set(original, 4, 1);
                    Assertions.assertEquals(Arrays.asList(1, 4, 3), result);
                },
                () -> {
                    LinkedList<Integer> original = new LinkedList<>(Arrays.asList(1, 2, 3));
                    LinkedList<Integer> result = Problem5.set(original, 4, 5); // Invalid index
                    Assertions.assertNull(result);
                },
                () -> {
                    LinkedList<Integer> original = new LinkedList<>(Arrays.asList(1));
                    LinkedList<Integer> result = Problem5.set(original, 2, 0);
                    Assertions.assertEquals(Arrays.asList(2), result);
                }
        );

    }

    @Test
    void toArray() {
        Assertions.assertAll(
                () -> {
                    LinkedList<Integer> original = new LinkedList<>(Arrays.asList(1, 2, 3));
                    int[] result = Problem5.toArray(original);
                    Assertions.assertArrayEquals(new int[]{1, 2, 3}, result);
                },
                () -> {
                    LinkedList<Integer> original = new LinkedList<>();
                    int[] result = Problem5.toArray(original);
                    Assertions.assertArrayEquals(new int[]{}, result);
                },
                () -> {
                    LinkedList<Integer> original = new LinkedList<>(Arrays.asList(1));
                    int[] result = Problem5.toArray(original);
                    Assertions.assertArrayEquals(new int[]{1}, result);
                }
        );
    }

    @Test
    void reverse() {
        Assertions.assertAll(
                () -> {
                    LinkedList<Integer> original = new LinkedList<>(Arrays.asList(1, 2, 3));
                    LinkedList<Integer> result = Problem5.reverse(original);
                    Assertions.assertEquals(Arrays.asList(3, 2, 1), result);
                },
                () -> {
                    LinkedList<Integer> original = new LinkedList<>();
                    LinkedList<Integer> result = Problem5.reverse(original);
                    Assertions.assertEquals(Arrays.asList(), result);
                },
                () -> {
                    LinkedList<Integer> original = new LinkedList<>(Arrays.asList(1));
                    LinkedList<Integer> result = Problem5.reverse(original);
                    Assertions.assertEquals(Arrays.asList(1), result);
                }
        );
    }
}