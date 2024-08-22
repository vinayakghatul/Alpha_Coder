package LinkedList;

import LinkedList.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortedLL {

    public static void main(String args[]) {
        Node n1 = new Node(8);
        Node n2 = new Node(3);
        n1.next = n2;
        Node n3= new Node(5);
        n2.next = n3;

        //n1->n2->n3
        Node h1 = n1;

        Node p1 = new Node(10);
        Node p2 = new Node(4);
        p1.next = p2;
        Node p3= new Node(6);
        p2.next = p3;

        //p1->p2->p3
        Node h2 = p1;

        List<Integer> nums = new ArrayList<>();
        while (h1 != null) {
            nums.add(h1.data);
            h1 = h1.next;
        }

        while (h2 != null) {
            nums.add(h2.data);
            h2 = h2.next;
        }

        Collections.sort(nums);

        //create new LL from sorted array

        Node result = new Node(-1);
        Node ans = result;

        for (int i=0;i<nums.size();i++) {
            result.next = new Node(nums.get(i));
            result = result.next;
        }
        ans = ans.next;

        //print final result

        while (ans != null) {
            System.out.println(ans.data);
            ans = ans.next;
        }






    }
}
