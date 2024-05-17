package Exercise;

public class LeetCode28 {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        if(haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        LeetCode28 leetCode28 = new LeetCode28();
        System.out.println(leetCode28.strStr(haystack, needle));
    }
}
