public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert("Mawar", 50);
        tree.insert("Melati", 30);
        tree.insert("Anggrek", 70);
        tree.insert("Lavender", 20);
        tree.insert("Tulip", 40);
        tree.insert("Dahlia", 60);
        tree.insert("Sakura", 80);

        System.out.println("Inorder Traversal:");
        tree.inorder();
        System.out.println();

        System.out.println("Nilai paling kecil:");
        Node min = tree.Min();
        System.out.println(min.nama + "(" + min.nilai + ")");
        System.out.println();

        System.out.println("Bunga dengan nilai genap:");
        tree.displayGenap();
    }
}