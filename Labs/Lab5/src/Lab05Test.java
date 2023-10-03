import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class Lab05Test {

    @org.junit.jupiter.api.Test
    void containsOnlyPrime() {
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertFalse(Lab05.containsOnlyPrime(new int[]{2, 3, 5, 8, 10, 12, 15}));
        }, () -> {
            Assertions.assertTrue(Lab05.containsOnlyPrime(new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29}));
        }, () -> {
            Assertions.assertTrue(Lab05.containsOnlyPrime(new int[]{2}));
        }, () -> {
            Assertions.assertFalse(Lab05.containsOnlyPrime(new int[]{4}));
        }});
    }

    @org.junit.jupiter.api.Test
    void fizzBuzz() {
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, Lab05.fizzBuzz(1, 5));
        }, () -> {
            Assertions.assertArrayEquals(new String[]{"Buzz", "Fizz", "22", "23", "Fizz", "Buzz"}, Lab05.fizzBuzz(20, 25));
        }, () -> {
            Assertions.assertArrayEquals(new String[]{"2"}, Lab05.fizzBuzz(2, 2));
        }, () -> {
            Assertions.assertArrayEquals(new String[]{"Fizz"}, Lab05.fizzBuzz(3, 3));
        }});

    }

    @org.junit.jupiter.api.Test
    void sumYucky() {
        java.util.ArrayList<Integer> list1 = new java.util.ArrayList<>(java.util.Arrays.asList(8, 7, 11, 9, 12, 10));
        java.util.ArrayList<Integer> list2 = new java.util.ArrayList<>(java.util.Arrays.asList(120, 99, 9));
        java.util.ArrayList<Integer> list3 = new java.util.ArrayList<>(java.util.Arrays.asList(9));
        java.util.ArrayList<Integer> list4 = new java.util.ArrayList<>();

        Assertions.assertEquals(9.0, Lab05.sumYucky(list1), 0.001);
        Assertions.assertEquals(109.5, Lab05.sumYucky(list2), 0.001);
        Assertions.assertEquals(0.0, Lab05.sumYucky(list3), 0.001);
        Assertions.assertEquals(0.0, Lab05.sumYucky(list4), 0.001);

    }

    @org.junit.jupiter.api.Test
    void countEvenOdds() {
        Assertions.assertAll(new Executable[]{() -> {
            Assertions.assertArrayEquals(new int[]{5, 0}, Lab05.countEvenOdds(new int[]{2, 4, 6, 8, 10}));
        }, () -> {
            Assertions.assertArrayEquals(new int[]{0, 5}, Lab05.countEvenOdds(new int[]{1, 3, 5, 7, 9}));
        }, () -> {
            Assertions.assertArrayEquals(new int[]{0, 0}, Lab05.countEvenOdds(new int[]{}));
        }, () -> {
            Assertions.assertArrayEquals(new int[]{3, 2}, Lab05.countEvenOdds(new int[]{1, 2, 3, 4, 6}));
        }});

    }

    @org.junit.jupiter.api.Test
    void shift() {
        java.util.ArrayList<String> list1 = new java.util.ArrayList<>(java.util.Arrays.asList("11", "12", "13", "14"));
        Assertions.assertEquals(java.util.Arrays.asList("12", "13", "14", "11"), Lab05.shift(list1, -1));

        java.util.ArrayList<String> list2 = new java.util.ArrayList<>(java.util.Arrays.asList("120", "120", "140", "140"));
        Assertions.assertEquals(java.util.Arrays.asList("140", "140", "120", "120"), Lab05.shift(list2, 2));

        java.util.ArrayList<String> list3 = new java.util.ArrayList<>(java.util.Arrays.asList("99999999"));
        Assertions.assertEquals(java.util.Arrays.asList("99999999"), Lab05.shift(list3, 1000));

        java.util.ArrayList<String> list4 = new java.util.ArrayList<>();
        Assertions.assertEquals(new java.util.ArrayList<String>(), Lab05.shift(list4, -9999999));
    }
}