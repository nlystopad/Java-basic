public class BTree {
    Node root;

    public void add(Integer element) {
        if (root == null) {
            root = new Node();
        }
        root.add(element);
    }

    public void printLeftToRight() {
        root.print();
    }
}
