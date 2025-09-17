import java.util.Objects;

public class _14_Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] strs) {
        int i = 0;
        char cur;
        StringBuilder res = new StringBuilder();

        while (true) {

            if (strs[0].length() < i + 1)
                return res.toString();
            else
                cur = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() < i + 1 || strs[j].charAt(i) != cur)
                    return res.toString();
            }

            res.append(cur);
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
