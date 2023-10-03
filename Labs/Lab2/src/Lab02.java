public class Lab02 {

    public static String Problem1(int temp, char unit){
        String C = "Celsius";
        String F = "Fahrenheit";
        String S = "";
        if (C.charAt(0) == unit){
            if (temp > 100){
                S = "gas";
            }
            if (temp <= 100 && temp >= 0){
                S = "liquid";
            }
            if (temp < 0){
                S = "solid";
            }}else{
            if (temp > 212){
                S = "gas";
            }
            if (temp <= 212 && temp >= 32){
                S = "liquid";
            }
            if (temp < 32){
                S = "solid";
            }
        }
        return S;
    }

    public static double Problem2(String Letter, String sign) {
        double score = 0;
        if (Letter.equals("A")) {
            if (sign.equals("-")) {
                score = 3.7;
            } else {
                score = 4;
            }
        }
        else if (Letter.equals("B")) {
            if (sign.equals("+")) {
                score = 3.3;
            } if (sign.equals("-")){
                score = 2.7;
            }
        }
        else if (Letter.equals("C")) {
            if (sign.equals("+")) {
                score = 2.3;
            }
            if (sign.equals("-")) {
                score = 1.7;
            }
        }
        else if (Letter.equals("D")) {
            if (sign.equals("+")) {
                score = 1.3;
            }
            if (sign.equals("-")) {
                score = 0.7;
            }
        }
        else {
                score = 0;
            }
        return score;
        }

    public static String Problem3(String name1, String name2, String name3){
        if (name1.compareTo(name2) > 0) {
            String temp = name1;
            name1 = name2;
            name2 = temp;
        }
        if (name2.compareTo(name3) > 0) {
            String temp = name2;
            name2 = name3;
            name3 = temp;
        }
        if (name1.compareTo(name2) > 0) {
            String temp = name1;
            name1 = name2;
            name2 = temp;
        }
        return (name1 + "," + name2 + "," + name3);
    }

    public static Boolean Problem4(int year){
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        }else{
            return false;
        }
    }

}
