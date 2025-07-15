public class LinkedList {
    private Node first;
    private int N;

    public LinkedList() {
        this.first = null;
        N = 0;
    }

    public void insert(int value, int pos){
        if (pos > N + 1){
            throw new ArrayIndexOutOfBoundsException();
        }
        Node cur = new Node(value);

        if (pos == 0) {
            if (this.isEmpty()){
                first = cur;
            } else {
                cur.next = first;
                first = cur;
            }
        } else {
            Node temp = first;
            for (int i = 0; i < pos - 1; i++){
                temp = temp.next;
            }
            cur.next = temp.next;
            temp.next = cur;
        }
        N++;
    }

    public int delete(int pos){
        if (pos > N){
            throw new ArrayIndexOutOfBoundsException();
        }
        int value;

        if (pos == 0){
            value = first.value;
            first = first.next;
        } else {
            Node temp = first;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }
            value = temp.next.value;

            if (pos == N - 1) {
                temp.next = null;
            } else {
                temp.next = temp.next.next;
            }
        }
        N--;
        return value;
    }

    public int getValue(int pos){
        if (pos >= N){
            throw new ArrayIndexOutOfBoundsException();
        }
        Node temp = first;
        for (int i = 0; i < pos; i++){
            temp = temp.next;
        }
        return temp.value;
    }

    public void display(){
        Node temp = first;
        for (int i = 0; i < N; i++){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean isEmpty(){
        return (N == 0);
    }
}
