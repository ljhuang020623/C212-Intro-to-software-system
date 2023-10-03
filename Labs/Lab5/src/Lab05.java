public class Lab05 {
    public static boolean containsOnlyPrime(int[] arr) {
        for (int num : arr) {
            if (num <= 1) {
                return false;
            }
            if (num == 2) {
                continue;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static String[] fizzBuzz(int min, int max) {
        String[] result = new String[max - min + 1];

        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i - min] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i - min] = "Fizz";
            } else if (i % 5 == 0) {
                result[i - min] = "Buzz";
            } else {
                result[i - min] = String.valueOf(i);
            }
        }

        // Print results within the method
        for (String str : result) {
            System.out.print(str + " ");
        }
        System.out.println();

        return result;
    }
    public static double sumYucky(java.util.ArrayList<Integer> vals) {
        if (vals == null || vals.size() == 0) {
            return 0.0;
        }

        int sum = 0;
        int count = 0;

        for (int i = 0; i < vals.size(); i++) {
            if (vals.get(i) == 9) {
                i++; // Skip the next number
            } else {
                sum += vals.get(i);
                count++;
            }
        }

        if (count == 0) {
            return 0.0;
        } else {
            return (double) sum / count;
        }
    }
    public static int[] countEvenOdds(int[] vals) {
        int[] result = {0, 0}; // {evens, odds}

        for (int val : vals) {
            if (val % 2 == 0) {
                result[0]++;
            } else {
                result[1]++;
            }
        }

        return result;
    }
    public static java.util.ArrayList<String> shift(java.util.ArrayList<String> ls, int i) {
        int size = ls.size();

        // Check for nonsensical shifts
        if (size == 0 || size == 1 || (size == 2 && Math.abs(i) > 1)) {
            return ls;
        }

        i = i % size;
        if (i < 0) {
            i += size; // Convert negative shift to its positive equivalent
        }

        java.util.ArrayList<String> shifted = new java.util.ArrayList<>(size);

        for (int j = 0; j < size; j++) {
            shifted.add(ls.get((j - i + size) % size)); // Updated shift logic
        }

        return shifted;
    }
}
