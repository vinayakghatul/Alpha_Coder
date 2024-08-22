package BinaryTree;

public class BSTSearch {

    public static void search(Node root, int value) {
        if (root == null) {
            System.out.println("Value not present in BST");
            return;
        }

        if (root.data == value) {
            System.out.println("Value present in BST");
            return;
        }

        if (root.data > value) {
            search(root.left, value);
        } else {
            search(root.right, value);
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

        search(root, 9);
    }
}
