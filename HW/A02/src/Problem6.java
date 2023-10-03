public class Problem6 {
    public static int parenthesesDepth(String str){
        int depth = 0;
        if (!str.isEmpty()){
            if (str.charAt(0) == '('){
                depth = 1 + parenthesesDepth(str.substring(1));
            }else if (str.charAt(0) == ')'){
                depth = -1 + parenthesesDepth(str.substring(1));
            }
        }
        return depth;
    }
    public static int parenthesesDepthTR(String str){
        return helper(str, 0);
    }
    private static int helper(String str, int a){
        if (str.isEmpty()){
            return a;
        }
        if (str.charAt(0) == '('){
            return helper(str.substring(1), a + 1);
        }else if (str.charAt(0) == ')'){
            return helper(str.substring(1), a - 1 );
        }else{
            return helper(str.substring(1), a);
        }
    }

    public static int parenthesesDepthLoop(String str){
        int i = 0, depth = 0;
        for (i = 0; i <= str.length() - 1; i ++){
            if (str.charAt(i) == '('){
                depth += 1;
            }else if (str.charAt(i) == ')'){
                depth -= 1;
            }
        }
        return depth;
    }
}
