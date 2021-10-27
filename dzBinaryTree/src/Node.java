public class Node {
    private Integer data;
    private Node left;
    private Node right;


    public Integer getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void add(Integer element) {
        if (data == null) {
            this.data = element;
        } else if (data > element) {
            if (left == null) {
                left = new Node();
            }
            getLeft().add(element);
        } else {
            if (right == null) {
                right = new Node();
            }
            getRight().add(element);
        }
    }


    public void print() {
        if (left != null)
            getLeft().print();
        System.out.printf("%d ", getData());
        if (right != null)
            getRight().print();
    }


}
