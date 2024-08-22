package PriorityQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PQTest {

    //sort an array
    public static void sortArray(List<Integer> arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i< arr.size();i++) {
            pq.add(arr.get(i));
        }
        while (!pq.isEmpty()) {
            int a = pq.poll();
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        List<Integer> arr = new ArrayList<>();
        int[] intArray = new int[]{ 7,2,4,1,6,7,8,4,21,3,4,22,3,56};

        arr.add(2);
        arr.add(5);
        arr.add(1);

        sortArray(arr);

    }
}
