import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class _1985_Find_the_Kth_Largest_Integer_in_the_Array {
    public static String kthLargestNumber(String[] nums, int k) {
        return recursiveQuickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    public static String recursiveQuickSelect(String[] arr, int left, int right, int k) {
        if (left >= right) {
            return arr[left];
        }

        int posPivot = ThreadLocalRandom.current().nextInt(left, right + 1);
        String pivot = arr[posPivot];  // определяем опорный элемент
        int[] pointers = partition(arr, pivot, left, right);    // получаем границы левой и правой части
        if (k <= pointers[0])
            return recursiveQuickSelect(arr, left, pointers[0], k);     // сортируем левую часть
        else if (k >= pointers[1])
            return recursiveQuickSelect(arr, pointers[1], right, k);    // сортируем правую часть
        else
            return pivot;
    }

    public static int[] partition(String[] arr, String pivot, int left, int right) {
        int low = left;
        int cur = left;
        int high = right;

        String temp;
        while (cur <= high) {
            int diff;
            if (arr[cur].length() < pivot.length())
                diff = -1;
            else if (arr[cur].length() > pivot.length())
                diff = 1;
            else
                diff = arr[cur].compareTo(pivot);

            if (diff < 0) {
                temp = arr[cur];
                arr[cur] = arr[low];
                arr[low] = temp;
                low++;
                cur++;
            } else if (diff == 0) {
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
        System.out.println(kthLargestNumber(new String[]{"3","6","7","10"}, 4));
    }
}
