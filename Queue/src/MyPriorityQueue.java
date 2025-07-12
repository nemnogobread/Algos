public class MyPriorityQueue {
    private int N;
    private int[] arr;
    private int maxN;

    public MyPriorityQueue(int maxN) {
        this.maxN = maxN;
        this.arr = new int[maxN];
        this.N = 0;
    }

    public void push(int value){
        if (N == 0){
            arr[0] = value;
        } else {
            int pos = 0;
            int temp;
            while(value < arr[pos]){
                pos += 1;
            }

            for (int i = N; i > pos; i--){
                arr[i] = arr[i - 1];
            }
            arr[pos] = value;
        }

        N += 1;
    }

    public int pop(){
        return arr[--N];
    }

    public int peek(){
        return arr[N - 1];
    }

    public boolean isFull() {
        return (N == maxN);
    }

    public boolean isEmpty(){
        return (N == 0);
    }

}
