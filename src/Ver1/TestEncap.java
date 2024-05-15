package Ver1;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Collections;

public class TestEncap {
    public static void main(String[] args) {
        String str = "11111 22222 33333 44444444".replace(" ", "");
        int[] counts = new int[str.length()]; // Tạo mảng để lưu số lần xuất hiện của mỗi chữ số
        int digit = 0;
        for (int i = 0; i < str.length(); i++) {
            digit = str.charAt(i) - '0' ; // Chuyển đổi ký tự sang số
            counts[digit]++; // Tăng số lần xuất hiện của chữ số tương ứng
        }

        for (int i = 0; i <= digit; i++) {
            System.out.println("Số " + i + " xuất hiện " + counts[i] + " lần");
        }
    }
//    public static int[] countInt(String str){
//        int leg = str.length();
//        int[] counts = new int[leg]; // Mảng lưu số lần xuất hiện của các chữ số
//        for (int i = 0; i < str.length(); i++) {
//            int digit = 0;
//            if(str.charAt(i) - '0' != 0){
//                digit = str.charAt(i) - '0'; // Chuyển đổi ký tự sang số
//            }
//            counts[digit]++; // Tăng số lần xuất hiện của chữ số tương ứng
//        }
//        return counts;
//    }
//    public static void printArray(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Số " + i + " xuất hiện " + arr[i] + " lần");
//        }
//    }

}

