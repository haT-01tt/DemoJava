package Exercise;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        int reserved = 0;
        int b = x;
        while (x != 0){
            int a = x % 10;
            x /= 10;
            reserved = reserved * 10 + a;
        }

        return reserved == b;
    }

    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(123));
    }
}
