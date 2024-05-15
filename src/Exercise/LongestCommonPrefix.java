package Exercise;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String a = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(a) != 0) {
                a = a.substring(0, a.length() - 1);
                if (a.isEmpty()) {
                    return "";
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight", "fly", "flaw"};
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));
        char ch1 = 'a';
        char ch2 = 'b';
        if (ch1 == ch2) {
            System.out.println("Hai ký tự giống nhau.");
        } else {
            System.out.println("Hai ký tự không giống nhau.");
        }
    }

}

