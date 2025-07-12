import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class MyStackFromTwoQueue {
    private Queue<Integer> que1;
    private Queue<Integer> que2;

    public MyStackFromTwoQueue() {
        this.que1 = new ArrayDeque<>();
        this.que2 = new ArrayDeque<>();
    }

    public void push(int x) {
        que1.add(x);
    }

    public int pop() {
        while (que1.size() > 1){
            que2.add(que1.remove());
        }
        int temp =  que1.remove();
        while (!que2.isEmpty()){
            que1.add(que2.remove());
        }
        return temp;
    }

    public int top() {
        while (que1.size() > 1){
            que2.add(que1.remove());
        }
        int temp = que1.remove();

        while (!que2.isEmpty()){
            que1.add(que2.remove());
        }
        que1.add(temp);
        return temp;
    }

    public boolean empty() {
        return que1.isEmpty();
    }
}
