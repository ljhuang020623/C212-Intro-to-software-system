import javax.swing.*;

public class Lab03 {
    public static int countStr(String n1){
        int n1Length = n1.length();
        String n2 = "str";
        if (n1Length < 3){
            return 0;
        }
        if (n1.substring(0, 3).equals(n2)){
            return countStr(n1.substring(1)) + 1;
        }
        return countStr(n1.substring(1));
    }

    public static int countStrTR(String input){
        return helper(input, 0);
    }

    private static int helper(String input, int startIndex){
        if (startIndex >= input.length()){
            return 0;
        }
        if(input.startsWith("str", startIndex)){
            return 1 + helper(input, startIndex + 3);
        }else{
            return helper(input, startIndex + 1);
        }
    }

    public static String replaceAB(String input){
        if (input.isEmpty()){
            return "";
        }
        char firstChar = input.charAt(0);
        if (firstChar == 'A'){
            firstChar = 'B';
        }
        String restOfTheString = replaceAB(input.substring(1));
        return firstChar + restOfTheString;
    }



    public static String replaceABTR(String input){
        return helper(input, 0, "");
    }
    private static String helper(String input, int currentIndex, String Result) {
        if (currentIndex >= input.length()) {
            return Result;
        }
        char currentChar = input.charAt(currentIndex);
        if (currentChar == 'A') {
            Result += 'B';
        } else {
            Result += currentChar;
        }
        return helper(input, currentIndex + 1, Result);
    }
    public static int countElephantEars(int numberOfElephants) {
        if (numberOfElephants <= 0) {
            return 0;
        } else {
            return 2 + countElephantEars(numberOfElephants - 1);
        }
    }
    public static int countElephantEarsTR(int numberOfElephants) {
        return helper(numberOfElephants, 0);
    }

    private static int helper(int numberOfElephants, int accumulatedEars) {
        if (numberOfElephants <= 0) {
            return accumulatedEars;
        } else {
            return helper(numberOfElephants - 1, accumulatedEars + 2);
        }
    }

}
