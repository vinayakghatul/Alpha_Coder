package BinaryTree;

/**
 * print root
 * visit left
 * visit right
 */
public class PreOrderTravel {

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        Node l1 = new Node(2);
        Node r1 = new Node(3);
        root.left = l1;
        root.right = r1;

        Node l11 = new Node(4);
        Node l12 = new Node(5);

        Node r11 = new Node(6);
        Node r12 = new Node(7);

        l1.left = l11;
        l1.right = l12;

        r1.left = r11;
        r1.right = r12;

        preorder(root);
    }
}
