package Exercise;

public class ReverseInteger {
    public static int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10; // Lấy chữ số cuối cùng
            x /= 10; // Loại bỏ chữ số cuối cùng từ số ban đầu
            // Kiểm tra nếu việc thêm chữ số mới sẽ làm cho số bị tràn
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            // Thêm chữ số vào phía sau của số đã đảo ngược
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-16587));
    }
}
