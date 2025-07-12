public class MyArray {
    private int[] arr;
    private int N;

    public MyArray(int maxN){
        this.arr = new int[maxN];
        N = 0;
    }

    public int find(int value){
        for (int i = 0; i < N; i++){
            if (arr[i] == value){
                return i;
            }
        }
        return -1;
    }

    public void insert(int value){
        arr[N] = value;
        N += 1;
    }

    public int delete(int value){
        int pos = -1;
        for (int i = 0; i < N; i++){
            if (arr[i] == value){
                pos = i;
                break;
            }
        }

        if (pos == -1){
            return -1;
        } else{
            for (int i = pos; i < N - 1; i++){
                arr[i] = arr[i+1];
            }
        }
        N -= 1;
        return pos;
    }

    public void display(){
        for (int i = 0; i < N; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
