import java.util.*;

public class Problem4 {

    public static HashMap<String, Integer> wordCount(String s) {
        s = s.replaceAll("[.,!\\?;\\-#&*()]", "");
        s = s.toLowerCase();
        String[] words = s.split(" ");
        HashMap<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            if (!word.trim().isEmpty()) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }
        return wordCounts;
    }

    public static LinkedHashSet<String> largeToSmall(HashMap<String, Integer> M) {
        int c = getHighestCount(M);
        LinkedHashSet<String>[] array = new LinkedHashSet[c];
        for (int i = 0; i < c; i++) {
            array[i] = new LinkedHashSet<>();
        }
        for (String key : M.keySet()) {
            int count = M.get(key);
            array[count - 1].add(key);
        }
        LinkedHashSet<String> result = new LinkedHashSet<>();
        for (int i = c - 1; i >= 0; i--) {
            result.addAll(array[i]);
        }
        return result;
    }

    private static int getHighestCount(HashMap<String, Integer> M) {
        int max = Integer.MIN_VALUE;
        for (int count : M.values()) {
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
