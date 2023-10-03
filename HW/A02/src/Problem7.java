public class Problem7 {
    public static String substring(String str, int low, int high){
        String str2 = "";
        int i = 0;
        if (low >= 0 && high <= str.length() && low <= high){
            for (i = low; i <= high - 1; i++){
                str2 += str.charAt(i);
            }
        }else {
            return null;
        }
        return str2;
    }

    public static int indexOf(String s, String key){
        int i = 0;
        for ( i = 0; i <= s.length() - key.length(); i ++){
            if (key.equals(substring(s, i, i + key.length()))){
                 return i;
            }
        }
        return -1;
    }

    public static int compareTo(String s1,String s2){
        if (s1.length() > s2.length()){
            return 1;
        }else if (s1.length() < s2.length()){
            return -1;
        }else {
            int i = 0;
            for (i = 0; i < s1.length() - 1; i ++){
                if (s1.charAt(i) > s2.charAt(i)){
                    return 1;
                }else if (s2.charAt(i) > s1.charAt(i)){
                    return -1;
                }
            }
            return 0;
        }
    }

    public static String trim(String s, char ch){
        int start = 0;
        int end = s.length() - 1;
        while (start < end && s.charAt(start) == ch){
            start ++;
        }
        while (end > start && s.charAt(end) == ch){
            end --;
        }
        if (start != end) {
            return substring(s, start, end + 1);
        }else{
            return "";
        }
    }

    public static String trimSpace(String s){
        int start = 0;
        int end = s.length() - 1;
        while (start < end && s.charAt(start) == ' '){
            start ++;
        }
        while (end > start && s.charAt(end) == ' '){
            end --;
        }
        if (start != end) {
            return substring(s, start, end + 1);
        }else{
            return "";
        }
    }
}
