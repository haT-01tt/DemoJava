package Ver1;

import java.util.HashMap;

public class Solution {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            String currentWord = words[i];

            if (charToWord.containsKey(currentChar)) {
                if (!charToWord.get(currentChar).equals(currentWord)) {
                    return false;
                }
            } else {
                charToWord.put(currentChar, currentWord);
            }

            if (wordToChar.containsKey(currentWord)) {
                if (wordToChar.get(currentWord) != currentChar) {
                    return false;
                }
            } else {
                wordToChar.put(currentWord, currentChar);
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String pattern1 = "abba", s1 = "dog cat cat dog";
        String pattern2 = "abba", s2 = "dog cat cat fish";
        String pattern3 = "aabaca", s3 = "dog dog cat dog fish dog";

        System.out.println(wordPattern(pattern1, s1)); // Output: true
        System.out.println(wordPattern(pattern2, s2)); // Output: false
        System.out.println(wordPattern(pattern3, s3)); // Output: false
    }
}
