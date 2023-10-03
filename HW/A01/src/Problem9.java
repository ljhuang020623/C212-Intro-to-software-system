public class Problem9 {
    public static int fitCandy(int smallNum, int largeNum, int maxWeight) {
        int totalWeight = largeNum * 5 + smallNum;
        if (totalWeight < maxWeight) {
            return -1;
        } else if (totalWeight > maxWeight) {
            if ((largeNum * 5) > maxWeight) {
                if (((maxWeight - largeNum * 5) < 0) && ((maxWeight - ((largeNum - 1) * 5)) > smallNum)) {
                    return -1;
                }
                else{
                    return smallNum;
                }
            } else if ((largeNum * 5) < maxWeight) {
                return maxWeight - largeNum * 5;
            } else {
                return 0;
            }
        } else {
            return smallNum;
        }
    }
}