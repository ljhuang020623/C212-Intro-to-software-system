public class Lab04 {
    public static boolean containsMiddleABC(String s) {
        int length = s.length();
        int leftCount = 0;
        int rightCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = s.charAt(i);

            if (i < length / 2) {
                leftCount++;
            } else if (i > length / 2) {
                rightCount++;
            }

            if (currentChar == 'A') {
                if (leftCount > rightCount && s.charAt(i + 1) == 'B' && s.charAt(i + 2) == 'C') {
                    return true;
                } else if (leftCount == rightCount && s.charAt(i - 1) == 'B' && s.charAt(i + 1) == 'C') {
                    return true;
                }
            }
        }
        return false;
    }

    public static String censor(String s, String c) {
        int sLength = s.length();
        int cLength = c.length();

        char[] result = new char[sLength];

        for (int i = 0; i < sLength; i++) {
            boolean match = true;
            for (int j = 0; j < cLength; j++) {
                if (i + j >= sLength || s.charAt(i + j) != c.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                for (int j = 0; j < cLength; j++) {
                    result[i + j] = '*';
                }
                i += cLength - 1;
            } else {
                result[i] = s.charAt(i);
            }
        }
        return new String(result);
    }



    public static boolean isSelfDividing(int n) {
        int originalN = n;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0 || originalN % digit != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static boolean allSelfDividing(int n) {
        int originalN = n;

        while (n > 0) {
            int digit = n % 10;

            if (digit == 0 || originalN % digit != 0) {
                return false;
            }

            n /= 10;
        }

        return true;
    }

    public static int strSumNums(String s) {
        int sum = 0;
        int currentNumber = 0;
        boolean inNumber = false;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + Character.getNumericValue(c);
                inNumber = true;
            } else if (inNumber) {
                sum += currentNumber;
                currentNumber = 0;
                inNumber = false;
            }
        }
        if (inNumber) {
            sum += currentNumber;
        }

        return sum;
    }

}
