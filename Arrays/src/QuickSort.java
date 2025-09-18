import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class QuickSort {
    public static void quickSort(int[] arr) {
        recursiveQuickSort(arr, 0, arr.length - 1);
    }

    public static void recursiveQuickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = arr[ThreadLocalRandom.current().nextInt(left, right + 1)];  // определяем опорный элемент
        int[] pointers = partition(arr, pivot, left, right);    // получаем границы левой и правой части
        recursiveQuickSort(arr, left, pointers[0]);     // сортируем левую часть
        recursiveQuickSort(arr, pointers[1], right);    // сортируем правую часть
    }

    public static int[] partition(int[] arr, int pivot, int left, int right) {
        int low = left;
        int cur = left;
        int high = right;

        int temp;
        while (cur <= high) {
            if (arr[cur] < pivot) {
                temp = arr[cur];
                arr[cur] = arr[low];
                arr[low] = temp;
                low++;
                cur++;
            } else if (arr[cur] == pivot) {
                cur++;
            } else {
                temp = arr[cur];
                arr[cur] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        return new int[]{low - 1, high + 1};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{8, 9, 3, 2, 5, 5, 1};
        quickSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
