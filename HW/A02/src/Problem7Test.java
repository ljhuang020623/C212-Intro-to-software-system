import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class Problem7Test {

    @Test
    void substring() {
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertEquals("Hello", Problem7.substring("Hello World", 0, 5));
        }, () -> {
            Assertions.assertEquals("World", Problem7.substring("Hello World", 6, 11));
        }, () -> {
            Assertions.assertEquals("He", Problem7.substring("Hello", 0, 2));
        }, () -> {
            Assertions.assertEquals("o", Problem7.substring("Hello", 4, 5));
        }, () -> {
            Assertions.assertEquals("ava", Problem7.substring("Java", 1, 4));
        }, () -> {
            Assertions.assertEquals("Progra", Problem7.substring("Programming", 0, 6));
        }, () -> {
            assertNull(Problem7.substring("Language", 3, 12));
        }});
    }

    @Test
    void indexOf() {
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertEquals(0, Problem7.indexOf("Hello World", "Hello"));
        }, () -> {
            Assertions.assertEquals(6, Problem7.indexOf("Hello World", "World"));
        }, () -> {
            Assertions.assertEquals(1, Problem7.indexOf("Hello", "e"));
        }, () -> {
            Assertions.assertEquals(-1, Problem7.indexOf("Hello", "z"));
        }, () -> {
            Assertions.assertEquals(1, Problem7.indexOf("Java", "ava"));
        }, () -> {
            Assertions.assertEquals(3, Problem7.indexOf("Programming", "gram"));
        }, () -> {
            Assertions.assertEquals(3, Problem7.indexOf("Language", "guage"));
        }});
    }

    @Test
    void compareTo() {
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertEquals(-1, Problem7.compareTo("cat", "dog"));
        }, () -> {
            Assertions.assertEquals(1, Problem7.compareTo("zebra", "lion"));
        }, () -> {
            Assertions.assertEquals(0, Problem7.compareTo("giraffe", "giraffe"));
        }, () -> {
            Assertions.assertEquals(-1, Problem7.compareTo("rhino", "rhinoceros"));
        }, () -> {
            Assertions.assertEquals(1, Problem7.compareTo("elephant", "elephan"));
        }, () -> {
            Assertions.assertEquals(1, Problem7.compareTo("tiger", "Tiger"));
        }, () -> {
            Assertions.assertEquals(-1, Problem7.compareTo("penguin", "penguino"));
        }});
    }

    @Test
    void trim() {
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertEquals("Hello", Problem7.trim("aaHelloa", 'a'));
        }, () -> {
            Assertions.assertEquals("World", Problem7.trim("bbbbWorldbbbb", 'b'));
        }, () -> {
            Assertions.assertEquals("", Problem7.trim("ccccc", 'c'));
        }, () -> {
            Assertions.assertEquals("jav", Problem7.trim("javaaaaa", 'a'));
        }, () -> {
            Assertions.assertEquals("Cat", Problem7.trim("aCat", 'a'));
        }, () -> {
            Assertions.assertEquals("Dog", Problem7.trim("Dogb", 'b'));
        }, () -> {
            Assertions.assertEquals("Elephan", Problem7.trim("Elephanttttt", 't'));
        }});
    }

    @Test
    void trimSpace() {
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertEquals("Hello", Problem7.trimSpace(" Hello "));
        }, () -> {
            Assertions.assertEquals("World", Problem7.trimSpace(" World "));
        }, () -> {
            Assertions.assertEquals("", Problem7.trimSpace("  "));
        }, () -> {
            Assertions.assertEquals("jav a", Problem7.trimSpace("jav a "));
        }, () -> {
            Assertions.assertEquals("Ca t", Problem7.trimSpace("  Ca t  "));
        }, () -> {
            Assertions.assertEquals("Dog", Problem7.trimSpace("Dog      "));
        }, () -> {
            Assertions.assertEquals("Lion", Problem7.trimSpace("Lion"));
        }});
    }
}