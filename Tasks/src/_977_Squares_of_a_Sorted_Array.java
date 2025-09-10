import java.util.Arrays;

public class _977_Squares_of_a_Sorted_Array {
    static class Solution {
        public static int[] sortedSquares(int[] nums) {
            int n = nums.length;
            boolean flag = true;
            int[] neg = new int[n];
            int[] ans = new int[n];
            int k;
            for (k = 0; k < n; k++){
                if (nums[k] < 0){
                    nums[k] *= nums[k];
                    neg[k] = nums[k];
                } else {
                    break;
                }
            }
            int i = k;
            k--;

            while (k >= 0 || i < n){
                if (i == n || (k >= 0 && neg[k] <= nums[i]*nums[i])){
                    ans[i-k-1] = neg[k];
                    k--;
                } else {
                    ans[i-k-1] = nums[i] * nums[i];
                    i++;
                }
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }
}
