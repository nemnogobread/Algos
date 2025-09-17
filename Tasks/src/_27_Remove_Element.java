public class _27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == val){
                continue;
            } else {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[] {0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }
}
