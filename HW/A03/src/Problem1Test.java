import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    @org.junit.jupiter.api.Test
    void linearSearch() {
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertEquals(0, Problem1.linearSearch(new String[]{"racecar", "blank", "tenet", "deed", "minute", "level"}, "racecar"));
        }, () -> {
                    Assertions.assertEquals(1, Problem1.linearSearch(new String[]{"racecar", "blank", "tenet", "deed", "minute", "level"}, "blank"));
        }, () -> {
                    Assertions.assertEquals(2, Problem1.linearSearch(new String[]{"racecar", "blank", "tenet", "deed", "minute", "level"}, "tenet"));
        }, () -> {
                    Assertions.assertEquals(3, Problem1.linearSearch(new String[]{"racecar", "blank", "tenet", "deed", "minute", "level"}, "deed"));
        }, () -> {
                    Assertions.assertEquals(4, Problem1.linearSearch(new String[]{"racecar", "blank", "tenet", "deed", "minute", "level"}, "minute"));
        }, () -> {
                    Assertions.assertEquals(-1, Problem1.linearSearch(new String[]{"racecar", "blank", "tenet", "deed", "minute", "level"}, "missing"));
        }});
    }

    @org.junit.jupiter.api.Test
    void linearSearchLoop() {
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertEquals(0, Problem1.linearSearchLoop(new String[]{"racecar", "blank", "tenet", "deed", "minute", "level"}, "racecar"));
        }, () -> {
            Assertions.assertEquals(1, Problem1.linearSearchLoop(new String[]{"racecar", "blank", "tenet", "deed", "minute", "level"}, "blank"));
        }, () -> {
            Assertions.assertEquals(2, Problem1.linearSearchLoop(new String[]{"racecar", "blank", "tenet", "deed", "minute", "level"}, "tenet"));
        }, () -> {
            Assertions.assertEquals(3, Problem1.linearSearchLoop(new String[]{"racecar", "blank", "tenet", "deed", "minute", "level"}, "deed"));
        }, () -> {
            Assertions.assertEquals(4, Problem1.linearSearchLoop(new String[]{"racecar", "blank", "tenet", "deed", "minute", "level"}, "minute"));
        }, () -> {
            Assertions.assertEquals(-1, Problem1.linearSearchLoop(new String[]{"racecar", "blank", "tenet", "deed", "minute", "level"}, "missing"));
        }});
    }
}