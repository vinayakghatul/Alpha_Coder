package LinkedList;

public class ReverseLLRecursion {

    public static Node reverseLL(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        //reverse rest of the list except head
        Node rest = reverseLL(head.next);
        //make head as last element
        head.next.next = head;
        //now head is last element and rest is at the head of reversed list
        head.next = null;

        return rest;

    }

    public static void main(String args[]) {

        Node n1 = new Node(5);
        Node n2 = new Node(6);
        n1.next = n2;
        Node n3 = new Node(7);
        n2.next = n3;
        Node n4 = new Node(8);
        n3.next = n4;
        n4.next = null;

        Node head = reverseLL(n1);

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }

    }

}
