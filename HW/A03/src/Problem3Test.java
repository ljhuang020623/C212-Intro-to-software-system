import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void isGivenExtraCredit() {
        Assertions.assertAll(new Executable[]{ () -> {
            Assertions.assertTrue(Problem3.isGivenExtraCredit(new ArrayList<>(Arrays.asList(90.0, 95.0, 92.5, 88.0)), 91.0));
        }, () -> {
            Assertions.assertFalse(Problem3.isGivenExtraCredit(new ArrayList<>(Arrays.asList(90.0, 95.0, 92.5, 88.0)), 97.0));
        }, () -> {
            Assertions.assertTrue(Problem3.isGivenExtraCredit(new ArrayList<>(Arrays.asList(50.0, 55.0, 52.5, 53.0)), 53.0));
        }, () -> {
            Assertions.assertFalse(Problem3.isGivenExtraCredit(new ArrayList<>(Arrays.asList(50.0, 55.0, 52.5, 53.0)), 49.0));
        }, () -> {
            Assertions.assertTrue(Problem3.isGivenExtraCredit(new ArrayList<>(Arrays.asList(70.0, 75.0, 72.5, 73.0)), 71.5));
        }, () -> {
            Assertions.assertFalse(Problem3.isGivenExtraCredit(new ArrayList<>(Arrays.asList(70.0, 75.0, 72.5, 73.0)), 78.0));
        }});
    }

    @Test
    void wisest() {
        Assertions.assertAll(new Executable[]{ () -> {
            Assertions.assertEquals(new ArrayList<>(Arrays.asList(43, 35)), Problem3.wisest(new ArrayList<>(Arrays.asList(31, 42, 43, 35, 21, 27, 24, 44))));
        }, () -> {
            Assertions.assertEquals(new ArrayList<>(Arrays.asList(33, 67)), Problem3.wisest(new ArrayList<>(Arrays.asList(47, 51, 52, 48, 33, 67, 45, 35))));
        }, () -> {
            Assertions.assertEquals(new ArrayList<>(Arrays.asList(35, 45)), Problem3.wisest(new ArrayList<>(Arrays.asList(35, 45, 25, 30, 20, 28, 22, 26))));
        }, () -> {
            Assertions.assertEquals(new ArrayList<>(Arrays.asList(70, 75)), Problem3.wisest(new ArrayList<>(Arrays.asList(70, 75, 72, 73, 68, 74, 71, 69))));
        }, () -> {
            Assertions.assertEquals(new ArrayList<>(Arrays.asList(20, 50)), Problem3.wisest(new ArrayList<>(Arrays.asList(10, 40, 20, 50, 30, 15, 25, 35))));
        }, () -> {
            Assertions.assertEquals(new ArrayList<>(Arrays.asList(60, 65)), Problem3.wisest(new ArrayList<>(Arrays.asList(60, 65, 55, 60, 50, 50, 45, 50))));
        }});
    }

    @Test
    void tokenize() {
        Assertions.assertAll(new Executable[]{ () -> {
            Assertions.assertEquals(new ArrayList<>(Arrays.asList("Hello", "world", "test")), Problem3.tokenize("Hello,world,test", ','));
        }, () -> {
            Assertions.assertEquals(new ArrayList<>(Arrays.asList("This", "is", "a", "tokenized", "string")), Problem3.tokenize("This is a tokenized string", ' '));
        }, () -> {
            Assertions.assertEquals(new ArrayList<>(Arrays.asList("Java", "Python", "C++")), Problem3.tokenize("Java|Python|C++", '|'));
       }, () -> {
            Assertions.assertEquals(new ArrayList<>(Arrays.asList("single")), Problem3.tokenize("single", ','));
       }, () -> {
            Assertions.assertEquals(new ArrayList<>(Arrays.asList("", "between", "delimiters")), Problem3.tokenize(",between,delimiters", ','));
       }, () -> {
            Assertions.assertEquals(new ArrayList<>(), Problem3.tokenize("", ','));
       }, () -> {
            Assertions.assertEquals(new ArrayList<>(Arrays.asList("onlyOneDelimiter")), Problem3.tokenize("onlyOneDelimiter,", ','));
       }, () -> {
            Assertions.assertEquals(new ArrayList<>(Arrays.asList("noDelimiterHere")), Problem3.tokenize("noDelimiterHere", '|'));
       }});
    }
}