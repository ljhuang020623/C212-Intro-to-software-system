public class Problem1 {
    public static int linearSearch(String[] S, String str){
        return helper(S, str, 0, S.length);
    }

    private static int helper(String[] S, String str, int start, int end){
        if (start < end){
            if (S[start].equals(str)){
                return start;
            }else{
                return helper(S, str, start + 1, end);
            }
        }
        return -1;
    }

    public static int linearSearchLoop(String[] S, String str){
        int i = 0;
        for (i = 0; i< S.length; i++){
            if (S[i].equals(str)){
                return i;
            }
        }
        return -1;
    }
}

