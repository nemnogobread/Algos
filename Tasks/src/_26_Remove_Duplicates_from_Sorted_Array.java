import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class _26_Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int k = 0;
        for (int num : nums) {
            if (set.contains(num))
                continue;

            set.add(num);
            nums[k] = num;
            k++;
        }

        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
