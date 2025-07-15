public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1, 0);
        list.insert(2, 0);
        list.insert(3, 0);
        list.display();
        list.insert(4, 3);
        list.insert(5, 2);

        list.display();

        list.delete(1);
        list.display();
        list.delete(0);
        list.display();
        list.delete(2);
        list.display();

        System.out.println(list.getValue(1));
    }
}