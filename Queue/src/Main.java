public class Main {
    public static void main(String[] args) {
        MyQueueFromTwoStacks myQueue = new MyQueueFromTwoStacks();

        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);

        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());


        myQueue.push(5);
        myQueue.push(6);
        myQueue.push(7);

        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
    }
}