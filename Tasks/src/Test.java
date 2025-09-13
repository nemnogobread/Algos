import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Map<Integer, Integer> countMap =  new HashMap<>();
        int[] nums = {4, 5, 1, 2, 0, 4, 5, 2};

        for (int num : nums){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : nums){
            if (countMap.get(num) == 1){
                System.out.println(num);
                break;
            }
        }
    }
}
