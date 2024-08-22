package HashMap;

import java.util.*;

public class TestMap {

    public static void main(String[] args) {

        Map<String,String> myMap = new HashMap<>();

        Set<String> m2 = new HashSet<>();

        myMap.put("k1","v1");
        myMap.put("k2","v2");
        myMap.put("k3","v3");

        Iterator<String> itr = myMap.keySet().iterator();

        while (itr.hasNext()) {
            System.out.println(myMap.get(itr.next()));
        }
    }
}
