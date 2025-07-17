public class BinaryTreeApp {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(5);
        tree.insert(3);
        tree.insert(4);
        tree.insert(9);
        tree.insert(8);
        tree.insert(2);

        System.out.println();

        tree.display();
        tree.delete(9);
        System.out.println("tralalero tralala");
        tree.display();

    }
}
