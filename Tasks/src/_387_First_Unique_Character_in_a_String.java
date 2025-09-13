import java.util.HashMap;
import java.util.Map;

public class _387_First_Unique_Character_in_a_String {
    public static void main(String[] args) {
        String s = "leetcode";

        Map<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            Character temp = s.charAt(i);
            countMap.put(temp, countMap.getOrDefault(temp,0) + 1);
        }

        for (int i = 0; i < s.length(); i++){
            Character temp = s.charAt(i);
            if (countMap.get(temp) == 1){
                System.out.println(temp);
                break;
            }
        }
    }
}
