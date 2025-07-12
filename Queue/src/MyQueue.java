public class MyQueue {
    private int maxSize;
    private int[] arr;
    private int front;
    private int rear;
    private int N;

    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.N = 0;
    }

    public void insert(int value){
        if (!isFull()){
            if (rear != maxSize - 1){
                arr[++rear] = value;
            } else {
                rear = 0;
                arr[rear] = value;
            }
            N += 1;
        } else {
            throw new ArrayIndexOutOfBoundsException("Queue is full!");
        }
    }

    public int remove(){
        if (!isEmpty()){
            int value = arr[front];
            if (front != maxSize - 1){
                front += 1;
            } else {
                front = 0;
            }
            N -= 1;
            return value;
        } else {
            throw new ArrayIndexOutOfBoundsException("Queue is empty!");
        }
    }

    public int peek(){
        if (!isEmpty()){
            return arr[front];
        } else {
            throw new ArrayIndexOutOfBoundsException("Queue is empty!");
        }
    }

    public boolean isFull(){
        return (N == maxSize);
    }

    public boolean isEmpty(){
        return (N == 0);
    }
}
