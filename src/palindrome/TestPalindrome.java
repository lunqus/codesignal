package palindrome;

import static java.lang.String.valueOf;

public class TestPalindrome {


    public static void main(String[] args) {

        String param = "roseesor";
        String res;

        TestPalindrome tp = new TestPalindrome();
        res = tp.palidrome(param);
        System.out.println(res);
        System.out.println(param.equals(res));
    }

    public String palidrome(String string) {

        char[] inArray = string.toCharArray();
        char[] revArray = new char[inArray.length];

        int y = 0;
        int x = inArray.length;

        for (int i = x-1; i >= 0; i--) {
            revArray[y] = inArray[i];
            y++;
        }

        return String.copyValueOf(revArray);
    }
}


