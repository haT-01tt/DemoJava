package Exercise;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        int right = 0;

        while (right < s.length()) {
            char currentChar = s.charAt(right);

            if (map.containsKey(currentChar)) {
                left = Math.max(map.get(currentChar) + 1, left);
            }

            map.put(currentChar, right);

            maxLength = Math.max(maxLength, right - left + 1);

            right++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String a ="pwwkew";
        System.out.println(lengthOfLongestSubstring(a));
    }
}
