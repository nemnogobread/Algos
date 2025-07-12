public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(10);

        System.out.println(myStack.isEmpty());
        System.out.println(myStack.isFull());

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack.peek());

        myStack.push(8);

        System.out.println(myStack.isEmpty());
        System.out.println(myStack.isFull());

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}