public class Main {
    public static void main(String[] args) {
        MyPriorityQueue myQueue = new MyPriorityQueue(10);

        myQueue.push(1);
        myQueue.push(8);
        myQueue.push(90);
        myQueue.push(3);

        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());


        myQueue.push(50);
        myQueue.push(60);
        myQueue.push(7);

        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
    }
}