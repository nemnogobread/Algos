/*
Максимальная сумма
Даны два массива целых чисел одинаковой длины A[0..n-1] и B[0..n-1]. Необходимо найти первую пару индексов
i0 и j0, i0 ≤ j0, такую что A[i0] + B[j0] = max {A[i] + B[j], где 0 <= i < n, 0 <= j < n, i <= j}. Время работы - O(n).
n ≤ 100000.
 */

public class MaxFirstSum {

    public static int[] solution(int[] arr1, int[] arr2){
        int iRes = 0, jRes = 0, iTemp = 0;
        boolean blockIRes = true;
        int n = arr1.length;
        int[] prefixMax = new int[n];
        int locMax = arr1[0] + arr2[0];
        prefixMax[0] = arr1[0];
        for (int j = 1; j < n; j++){
            if (arr1[j] > prefixMax[j-1]){
                prefixMax[j] = arr1[j];
                iTemp = j;
            } else {
                prefixMax[j] = prefixMax[j - 1];
            }
            if (arr2[j] + prefixMax[j] > locMax){
                locMax = arr2[j] + prefixMax[j];
                jRes = j;
                iRes = iTemp;
            }
        }

        return new int[]{iRes, jRes};
    }

    public static void main(String[] args) {
        int[] a = {4, -8, 6, 0, 0};
        int[] b = {-10, 3, 1, 1, 2};
        int[] res = solution(a, b);
        System.out.println(res[0] + " " + res[1]);
    }
}
