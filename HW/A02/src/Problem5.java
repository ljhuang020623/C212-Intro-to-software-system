public class Problem5 {
    public static String collatz(int n){
        if (n == 1){
            return "1";
        }else if ((n % 2) == 0){
            return n + "," + collatz(n / 2);
        }else {
            return n + "," + collatz(3 * n  +1);
        }
    }

    public static String collatzTR(int n){
        return helper(n, "");
    }

    private static String helper(int n, String a){
        if (n == 1){
            return a + "1";
        }else if ((n % 2) == 0){
            return helper(n / 2, a + n + ",");
        }else {
            return helper(3 * n + 1, a + n + ",");
        }
    }

    public static String collatzLoop(int n){
        String str = "";
        if (n == 1){
            return str + "1";
        }else {
            while (n > 1) {
                if ((n % 2) == 0) {
                    str = str + n + ",";
                    n = n / 2;
                } else {
                    str = str + n + ",";
                    n = 3 * n + 1;
                }
            }
        }
        return str + "1";
    }
}
