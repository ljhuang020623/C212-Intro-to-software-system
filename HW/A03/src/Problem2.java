import java.util.HashSet;

public class Problem2 {
    public static int[] peakFinder(int[] H){
        HashSet<Integer> seenPeaks = new HashSet<>();
        int[] tempPeaks = new int[H.length];
        int count = 0;
        for (int i = 1; i < H.length - 1; i++) {
            if (H[i-1] < H[i] && H[i] > H[i+1] && !seenPeaks.contains(H[i])) {
                seenPeaks.add(H[i]);
                tempPeaks[count] = H[i];
                count++;
            }
        }
        int[] result = new int[seenPeaks.size()];
        System.arraycopy(tempPeaks, 0, result, 0, seenPeaks.size());

        return result;
    }
}
