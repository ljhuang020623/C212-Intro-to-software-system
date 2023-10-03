import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Problem6Test {

    @Test
    void lookup() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("one", 1);
        map1.put("two", 2);
        map1.put("three", 3);

        assertEquals(Integer.valueOf(1), Problem6.lookup(map1, "one"));
        assertEquals(Integer.valueOf(3), Problem6.lookup(map1, "three"));
        assertNull(Problem6.lookup(map1, "four"));

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "apple");
        map2.put(2, "banana");

        assertEquals("apple", Problem6.lookup(map2, 1));
        assertEquals("banana", Problem6.lookup(map2, 2));
        assertNull(Problem6.lookup(map2, 3));
    }

    @Test
    void stringifyList() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        assertEquals("1,2,3", Problem6.stringifyList(list1));

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("banana");
        list2.add("cherry");
        assertEquals("apple,banana,cherry", Problem6.stringifyList(list2));

        ArrayList<Double> list3 = new ArrayList<>();
        assertEquals("", Problem6.stringifyList(list3));
    }
}