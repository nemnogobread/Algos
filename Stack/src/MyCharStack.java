public class MyCharStack {
    private int N;
    private char[] arr;
    private int top;

    public MyCharStack(int maxN) {
        N = maxN;
        top = -1;
        arr = new char[N];
    }

    public void push(char value){
        if (!this.isFull()){
            arr[++top] = value;
        } else {
            throw new ArrayIndexOutOfBoundsException("Stack is full!");
        }
    }

    public int pop(){
        if (!this.isEmpty()){
            return arr[top--];
        } else {
            throw new ArrayIndexOutOfBoundsException("Stack is empty!");
        }
    }

    public int peek(){
        if (!this.isEmpty()){
            return arr[top];
        }
        else {
            throw new ArrayIndexOutOfBoundsException("Stack is empty!");
        }
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == N - 1);
    }
}
