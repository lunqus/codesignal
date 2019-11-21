package reverseInParentheses;

public class ReverseString {

    String reverseString(String s) {
        char[] charArr = s.toCharArray();
        String str = "";

        for(int i = charArr.length - 1; i > 0; i--) {
            str += Character.toString(charArr[i]);
        }
        return str;
    }
}
