package Java8;

import java.util.List;
import java.util.Scanner;

public class TestJava8 {
    private static final String[] ones = {"", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
    private static final String[] options = {"","Linh", "Mười", "Mươi", "Trăm", "Nghìn", "Triệu", "Tỷ"};

    public static String convertNumberToWord(int number) {
        if (number == 0) {
            return "Không";
        }

        StringBuilder result = new StringBuilder();
        int optionIndex = 0;

        while (number > 0) {
            int chunk = number % 1000;
            if (chunk > 0) {
                if (result.length() > 0) {
                    result.insert(0, " ");
                }
                result.insert(0, convertChunkToWord(chunk) + " " + options[optionIndex + 1]);
            }
            number /= 1000;
            optionIndex += 3;
        }

        return result.toString().trim();
    }

    private static String convertChunkToWord(int number) {
        StringBuilder chunkWord = new StringBuilder();

        int hundred = number / 100;
        int ten = (number % 100) / 10;
        int one = number % 10;

        if (hundred > 0) {
            chunkWord.append(ones[hundred]).append(" ").append(options[2]).append(" ");
        }

        if (ten > 0) {
            if (ten == 1) {
                chunkWord.append(options[1]).append(" ");
            } else {
                chunkWord.append(ones[ten]).append(" ").append(options[1]).append(" ");
            }
        }

        if (one > 0 || (hundred == 0 && ten == 0)) {
            chunkWord.append(ones[one]);
        }

        return chunkWord.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dạng số: ");
        int number = scanner.nextInt();
        scanner.close();

        String word = convertNumberToWord(number);
        System.out.println("Số " + number + " được viết dưới dạng chữ là: " + word);

        List<Integer> integerList = List.of(1,2,3,4,5,6,7,9,10);
    }
}
