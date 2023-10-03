import java.util.ArrayList;
import java.util.Map;

public class Problem6 {
    public static <K, V> V lookup(Map<K, V> M, K k) {
        for (Map.Entry<K, V> entry : M.entrySet()) {
            if (entry.getKey().equals(k)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public static <T> String stringifyList(ArrayList<T> list) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            result.append(list.get(i).toString());
            if (i < list.size() - 1) {
                result.append(",");
            }
        }
        return result.toString();
    }

}
