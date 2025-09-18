import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr, int l, int r){
        recursiveMergeSort(arr, 0, arr.length - 1);
    }

    public static void recursiveMergeSort(int[] arr, int l, int r){
        if (r - l == 0){
            return;
        }

        int mid = (r + l) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr,mid + 1, r);

        int[] temp = Arrays.copyOfRange(arr, l, r + 1);
        int i = l;
        int j = mid + 1;

        while (i <= mid || j <= r){
            if (j == r + 1 || (temp[i - l] <= temp[j - l] && i <= mid)) {
                arr[i+j-mid-1] = temp[i - l];
                i++;
            } else {
                arr[i+j-mid-1] = temp[j - l];
                j++;
            }
        }
    }
}
