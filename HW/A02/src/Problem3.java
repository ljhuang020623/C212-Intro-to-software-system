public class Problem3 {
    public static boolean isPalindromeTR(String word){
        return helper(word, 0, word.length() - 1);
    }
    private static boolean helper(String word, int start, int end){
        if (word.charAt(start) != word.charAt(end)){
            return false;
        } else if (start >= end){
            return true;
        } else {
            return helper(word, start + 1, end - 1);
        }
    }

    public static boolean isPalindromeLoop(String word){
        int i;
        String str = "";
        for ( i = word.length() - 1; i >= 0; i --){
            str += word.charAt(i);
        }
        if (str.equals(word)){
            return true;
        }else{
            return false;
        }

    }
}
