public class _13_Roman_to_Integer {
    public static int romanToInt(String s) {
        int res = 0;
        int prevValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int curValue = getValue(s.charAt(i));

            if (prevValue <= curValue)
                res += curValue;
            else
                res -= curValue;

            prevValue = curValue;
        }
        return res;
    }

    private static int getValue(char ch){
        switch (ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
}
