package Exercise;

public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        // Nếu chỉ có một hàng hoặc chuỗi rỗng, trả về luôn
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        // Khởi tạo một mảng để lưu từng hàng của dạng zigzag
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        // Biến để xác định hướng di chuyển
        boolean goingDown = false;
        int currentRow = 0;

        // Duyệt qua từng ký tự trong chuỗi và đặt vào hàng tương ứng
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);
            // Nếu đang ở hàng đầu hoặc cuối, đảo ngược hướng di chuyển
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            // Di chuyển lên hoặc xuống hàng tiếp theo tùy theo hướng di chuyển
            currentRow += goingDown ? 1 : -1;
        }

        // Kết hợp từng hàng thành một chuỗi
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
}
