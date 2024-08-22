package BinaryTree;

public class BSTInsert {

    public static void insert(Node root, int value) {
        Node n1 = new Node(value);
        if (root == null) {
            root = n1;
            return;
        }
        // use prev to hold parent and temp to hold children
        Node prev = null;
        Node curr = root;

        while (curr != null) {
            if (curr.data > value) {
                prev = curr;
                curr = curr.left;
            } else {
                prev = curr;
                curr = curr.right;
            }
        }
        if (prev.data > value) {
            prev.left = n1;
        } else {
            prev.right = n1;
        }

    }

    public static void main(String args[]) {
        Node root = new Node(5);
        Node l1 = new Node(3);
        Node r1 = new Node(8);
        root.left = l1;
        root.right = r1;

        Node l11 = new Node(2);
        Node l12 = new Node(4);

        Node r11 = new Node(6);
        Node r12 = new Node(9);

        l1.left = l11;
        l1.right = l12;

        r1.left = r11;
        r1.right = r12;

        insert(root, 9);
    }
}
