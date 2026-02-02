import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex05 {
    public static void main(String[] args) {
        String[] sports = {"soccer", "baseball", "jogging", "jogging", "soccer", "surfing", "surfing", "soccer", "surfing", "baseball", "boxing", "surfing", "soccer", "surfing", "jogging", "boxing", "jogging", "baseball", "soccer", "soccer"};
        Map<String, Integer> sportMap = new HashMap<>();
        
        // sportMapの中にどのスポーツが何回出たかを格納する
        for (String sport: sports) {
            Set<String> sportSet = sportMap.keySet();
            if (sportSet.contains(sport)) {
                int val = sportMap.get(sport);
                sportMap.put(sport, val + 1);
            } else {
                sportMap.put(sport, 1);
            }
        }

        Collection<Integer> counts = sportMap.values();
        int max = 0;
        for (Integer count: counts) {
            if (max < count) {
                max = count;
            }
        }
        
        List<Map.Entry<String, Integer>> list = new ArrayList<>(sportMap.entrySet());
        for (Map.Entry<String, Integer> entry: list) {
            if (entry.getValue() == max) {
                System.out.println("最も出現回数の多いスポーツは" + entry.getKey() + "で、出現回数は" + entry.getValue() + "回です");
            }
        }
    }
}
