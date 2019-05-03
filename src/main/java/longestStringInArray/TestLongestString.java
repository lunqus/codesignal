package longestStringInArray;

import java.util.Arrays;

public class TestLongestString {

    public static void main(String[] args) {

        LongestStrings ls = new LongestStrings();
        String[] str = {"aba", "aa", "ad", "vcd", "aba"};

        System.out.println(Arrays.toString(ls.allLongestStrings(str)));
        System.out.println(Arrays.toString(str));
    }
}
