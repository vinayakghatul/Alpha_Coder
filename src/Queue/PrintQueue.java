package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class PrintQueue {

    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);

        System.out.println(queue.peek());
        //queue.remove();
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
