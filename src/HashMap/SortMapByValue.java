package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValue {

    public static void main(String[] args) {

        Map<String, Integer> mp = new HashMap<>();
        mp.put("a", 100);
        mp.put("b", 50);
        mp.put("c", 10);
        mp.put("d", 500);

        //iterate over map and print
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " - Value: " + entry.getValue());
        }

        //sort by values and then iterate again;

        Map<String, Integer> result = mp.entrySet().stream()
                                        .sorted((v1, v2) -> v1.getValue().compareTo(v2.getValue()))
                                            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for (Map.Entry<String, Integer> en : result.entrySet()) {
            System.out.println(en.getKey() + " - Value: " + en.getValue());
        }
    }
}
