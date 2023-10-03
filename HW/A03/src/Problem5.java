import java.util.LinkedList;

public class Problem5 {

    public static LinkedList<Integer> addLast(LinkedList<Integer> l, int v) {
        LinkedList<Integer> newList = new LinkedList<>();
        for (int i = 0; i < l.size(); i++) {
            newList.add(l.get(i));
        }
        newList.add(v);
        return newList;
    }

    public static LinkedList<Integer> set(LinkedList<Integer> l, int v, int index) {
        if (index < 0 || index >= l.size()) {
            return null;
        }

        LinkedList<Integer> newList = new LinkedList<>();
        for (int i = 0; i < l.size(); i++) {
            if (i == index) {
                newList.add(v);
            } else {
                newList.add(l.get(i));
            }
        }
        return newList;
    }
    public static int[] toArray(LinkedList<Integer> l) {
        int[] arr = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            arr[i] = l.get(i);
        }
        return arr;
    }
    public static LinkedList<Integer> reverse(LinkedList<Integer> l) {
        LinkedList<Integer> reversedList = new LinkedList<>();
        for (int i = l.size() - 1; i >= 0; i--) {
            reversedList.add(l.get(i));
        }
        return reversedList;
    }
}
