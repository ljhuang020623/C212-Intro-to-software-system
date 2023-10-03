import java.util.ArrayList;
public class Problem3 {
    public static boolean isGivenExtraCredit(ArrayList<Double> D, double g) {
        double total = 0;
        for (double score : D) {
            total += score;
        }
        double avg = total / D.size();
        double lowerBound = avg * 0.95;
        double upperBound = avg * 1.05;

        return g >= lowerBound && g <= upperBound;
    }
    public static ArrayList<Integer> wisest(ArrayList<Integer> A) {
        int maxSum = Integer.MIN_VALUE;
        int maxAge = Integer.MIN_VALUE;
        ArrayList<Integer> wisestPair = new ArrayList<>();

        for (int i = 0; i < A.size(); i += 2) {
            int age1 = A.get(i);
            int age2 = A.get(i + 1);
            int sum = age1 + age2;

            if (sum > maxSum || (sum == maxSum && (age1 > maxAge || age2 > maxAge))) {
                maxSum = sum;
                maxAge = Math.max(age1, age2);
                wisestPair.clear();
                wisestPair.add(age1);
                wisestPair.add(age2);
            }
        }

        return wisestPair;
    }

    public static ArrayList<String> tokenize(String s, char d) {
        ArrayList<String> tokens = new ArrayList<>();
        int startIdx = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == d) {
                char[] arr = new char[i - startIdx];
                for (int j = startIdx; j < i; j++) {
                    arr[j - startIdx] = s.charAt(j);
                }
                tokens.add(new String(arr));
                startIdx = i + 1;
            }
        }
        if (startIdx < s.length()) {
            char[] arr = new char[s.length() - startIdx];
            for (int j = startIdx; j < s.length(); j++) {
                arr[j - startIdx] = s.charAt(j);
            }
            tokens.add(new String(arr));
        }

        return tokens;
    }

    public static void main(String[] args) {
        System.out.println(tokenize("Hello,world,test", ','));
    }


}
