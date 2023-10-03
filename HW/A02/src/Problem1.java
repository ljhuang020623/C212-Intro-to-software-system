public class Problem1 {
    public static int fibonacci(int num){
        if (num == 1 || num == 0){
            return num;
        } else {
          return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
    public static int fibonacciTR(int num){
        return  helper(num, 0, 1);
    }

    private static int helper(int num, int a, int b){
        if (num == 0){
            return a;
        } else if (num == 1){
            return b;
        } else {
            return helper(num - 1, b, a + b);
        }
    }

    public static int fibonacciLoop(int num){
        if (num <= 1){
            return num;
        }
        int i;
        int a = 0;
        int b = 1;
        for (i = 2; i <= num; i ++){
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}

