public class Tree {
    Node root;

    public void insert(String nama, int nilai) {
        root = insertBunga(root, nama, nilai);
    }

    Node insertBunga(Node root, String nama, int nilai) {
        if (root == null) {
            return new Node(nama, nilai);
        }
        if (nilai < root.nilai) {
            root.left = insertBunga(root.left, nama, nilai);
        } else {
            root.right = insertBunga(root.right, nama, nilai);
        }
        return root;
    }

    public void inorder() {
        inorderBunga(root);
        System.out.println();
    }

    void inorderBunga(Node root) {
        if (root != null) {
            inorderBunga(root.left);
            System.out.print(root.nama + "(" + root.nilai + "), ");
            inorderBunga(root.right);
        }
    }

    public Node Min() {
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public void displayGenap() {
        genap(root);
        System.out.println();
    }

    private void genap(Node root) {
        if (root != null) {
            genap(root.left);

            if (root.nilai % 2 == 0) {
                System.out.print(root.nama + "(" + root.nilai + "), ");
            }

            genap(root.right);
        }
    }
}