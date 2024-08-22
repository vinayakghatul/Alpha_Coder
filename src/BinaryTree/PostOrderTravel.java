package BinaryTree;

/**
 * visit left
 * visit right
 * print root
 */
public class PostOrderTravel {

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
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

        postorder(root);
    }
}
