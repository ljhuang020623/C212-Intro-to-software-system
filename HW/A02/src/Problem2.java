public class Problem2 {
    public static boolean isPrimeTR(int num){
        return helper(num, 2);
    }
    private static boolean helper(int num, int divider){
            if ((num == 1) || (num == 0)){
                return false;
            }else if ((num % divider) != 0){
                return helper(num , divider + 1);
            } else {
                return divider >= 1 && divider == num;
            }
    }
    public static boolean isPrimeLoop(int num) {
        int i;
        if ((num == 1) || (num == 0)) {
            return false;
        } else {
            for (i = num - 1; i > 1; i--) {
                if ((num % i) == 0) {
                    return false;
                }
            }
        }
        return true;
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
}


