import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

public class Problem4Test {

    @Test
    public void testWordCount() {
        String s = "Hello world, the world is healthy, is" +
                " it not? I certainly agree that the world" +
                " is #1 and healthy.";

        Map<String, Integer> result = Problem4.wordCount(s);

        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello", 1);
        expected.put("world", 3);
        expected.put("the", 2);
        expected.put("is", 3);
        expected.put("healthy", 2);
        expected.put("it", 1);
        expected.put("i", 1);
        expected.put("certainly", 1);
        expected.put("agree", 1);
        expected.put("that", 1);
        expected.put("1", 1);
        expected.put("and", 1);
        expected.put("not", 1);

        assertEquals(expected, result);
    }

    @Test
    public void testLargeToSmall() {
        String s = "Hello world, the world is healthy, is" +
                " it not? I certainly agree that the world" +
                " is #1 and healthy.";

        HashMap<String, Integer> wc = Problem4.wordCount(s);

        LinkedHashSet<String> result = Problem4.largeToSmall(wc);

        LinkedHashSet<String> expected = new LinkedHashSet<>();
        expected.addAll(Arrays.asList("world", "is", "the", "healthy", "hello", "it", "i", "certainly", "agree", "that", "1", "and", "not"));

        assertEquals(expected, result);
    }
}
