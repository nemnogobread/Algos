import java.util.Stack;

class MyQueueFromTwoStacks {
    Stack<Integer> addStack;
    Stack<Integer> delStack;

    public MyQueueFromTwoStacks() {
        addStack = new Stack<>();
        delStack = new Stack<>();
    }

    public void push(int x) {
        addStack.push(x);
    }

    public int pop() {
        this.peek();
        return delStack.pop();
    }

    public int peek() {
        if (!delStack.empty()){
            while (!addStack.empty()){
                delStack.push(addStack.pop());
            }
        }
        return delStack.peek();
    }

    public boolean empty() {
        return (addStack.empty() && delStack.empty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */