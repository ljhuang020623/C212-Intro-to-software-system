public class Conditionals {

    public static String computeGrade(int grade){
        String letterGrade = "";
        if (grade >= 90 && grade <= 100){
            letterGrade = "A";
        }
        else if (grade >= 80){
            letterGrade = "B";
        }
        else if (grade >=70){
            letterGrade = "C";
        }
        else if (grade >= 60){
            letterGrade = "D";
        }
        else {
            letterGrade = "F";
        }
        return letterGrade;
    }

    public static void main(String[] args){
        int x = 5;
        int y = 6;
        int z = 2;
        if(x < y || z < 6) {

        }
    }
    public static int monthsToDays(String s) {
        if (s.equals("January")){
    }
}
