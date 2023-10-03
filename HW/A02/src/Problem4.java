public class Problem4 {
    public static boolean isNestedParenthesesTR(String str){
        return helper(str, 0, str.length() - 1);
    }
    private static boolean helper(String str, int start, int end){
        if ((str.length() % 2) != 0){
            return false;
        }else if (start >= end){
            return true;
        }else if (str.charAt(start) == '(' && str.charAt(end) == ')'){
            return helper(str, start + 1, end - 1);
        }else {
            return false;
        }
    }

    public static boolean isNestedParenthesesLoop(String str) {
        if (str.length() % 2 != 0) return false;
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != '(' || str.charAt(end) != ')') {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
