import java.util.Random;

public class Main {

    public static void main(String[] args) {
        BTree btree = new BTree();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            btree.add(random.nextInt(30));
        }
        btree.printLeftToRight();
    }
}
