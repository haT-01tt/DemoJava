package Exercise;

public class LC58 {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        if (words.length == 0) {
            return 0;
        }
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        LC58 LC58 = new LC58();
        String s = "Hello World";
        System.out.println("\nOutput: " + LC58.lengthOfLastWord(s));
    }
}
