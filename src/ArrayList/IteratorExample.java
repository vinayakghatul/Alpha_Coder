package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("abc");
        names.add("pqr");
        names.add("xyz");

        Iterator<String> itr = names.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
