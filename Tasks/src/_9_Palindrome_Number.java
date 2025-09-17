public class _9_Palindrome_Number {
    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        char[] ch = new char[20];

        int k = 0;
        int cur = x;
        while (cur > 0) {
            ch[k] = (char) (cur % 10 + '0');
            cur /= 10;
            k++;
        }
        k--;

        int i = 0;
        while (k - i > 0) {
            if (ch[k] != ch[i]){
                return false;
            }
            k--;
            i++;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }
}
