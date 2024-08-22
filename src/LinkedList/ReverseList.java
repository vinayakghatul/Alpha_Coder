package LinkedList;

public class ReverseList {
    //using curr, prev, next pointers


    public static void main(String args[]) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n1.next = n2;
        Node n3 = new Node(3);
        n2.next = n3;
        Node n4 = new Node(4);
        n3.next = n4;
        n4.next = null;


        Node prev = null;
        Node curr = n1;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        while (prev != null) {
            System.out.println(prev.data);
            prev = prev.next;
        }



    }
}
