public class MyOrderedArray {
    private int[] arr;
    private int N;

    public MyOrderedArray(int maxN) {
        arr = new int[maxN];
        N = 0;
    }

    private int binSearchForFind(int value){
        if (arr[0] > value || arr[N-1] < value){
            return -1;
        }

        int left = 0;
        int right = N - 1;
        int cur;

        while(true){
            cur = (left + right) / 2;

            if (arr[cur] == value){
                return cur;
            }
            if (left > right){
                return -1;
            }
            if (arr[cur] < value){
                left = cur + 1;
            } else {
                right = cur - 1;
            }
        }
    }

    private int binSearchForInsert(int value){
        if (arr[0] > value || N == 0){
            return  0;
        } else if (arr[N-1] < value) {
            return N;
        }

        int left = 0;
        int right = N - 1;
        int cur;

        while(true){
            cur = (left + right) / 2;

            if (arr[cur] == value){
                return cur;
            }
            if (right - left == 1 && arr[right] > value && arr[left] < value){
                return right;
            }
            if (arr[cur] < value){
                left = cur;
            } else {
                right = cur;
            }
        }
    }

    public int find(int value) {
        return this.binSearchForFind(value);
    }

    public void insert(int value) {
        int pos = this.binSearchForInsert(value);

        for (int i = N; i > pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = value;
        N += 1;
    }

    public int delete(int value) {
        int pos = find(value);
        if (pos == -1){
            return -1;
        }

        for (int i = pos; i < N - 1; i++){
            arr[i] = arr[i+1];
        }
        N -= 1;

        return pos;
    }

    public void display() {
        for (int i = 0; i < N; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
