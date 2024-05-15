package Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Monotonous {
    boolean isMonotonous(int[] sequence) {
        if(sequence.length == 1){
            return true;
        }
        if(sequence.length == 2){
            return false;
        }
        for(int i = 0; i <= sequence.length - 1; i++){
            if(sequence[i] < sequence[i + 1] || sequence[i] > sequence[i + 1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] sequence = {3,3};
        System.out.println(new Monotonous().isMonotonous(sequence));
    }

    int FibSum(int n)
    {
        int mod = 1000000007;
        int[] fib = new int[n + 1];
        if (n == 1) {
            System.out.println(1);
            return 0;
        }

        fib[1] = 1;
        fib[2] = 1;
        int sum = fib[1] + fib[2];

        for (int i = 3; i <= n; i++) {
            fib[i] = (fib[i - 1] + fib[i - 2]) % mod;
            sum = (sum + fib[i]) % mod;
        }
        return sum;
    }

    int[] createNumber(int n, int k) {
        TreeSet<Integer> results = new TreeSet<>();
        if(n == 1){
            return new int[]{0,1,2,3,4,5,6,7,8,9};
        }
        for (int i = 1; i <= 9; i++) {
            generateNumbers(i, n - 1, k, results);
        }

        int[] resultArray = new int[results.size()];
        int index = 0;
        for (int num : results) {
            resultArray[index++] = num;
        }

        return resultArray;
    }

    void generateNumbers(int currentNumber, int remainingDigits, int k, TreeSet<Integer> results) {
        if (remainingDigits == 0) {
            results.add(currentNumber);
            return;
        }

        int lastDigit = currentNumber % 10;

        if (lastDigit + k <= 9) {
            generateNumbers(currentNumber * 10 + (lastDigit + k), remainingDigits - 1, k, results);
        }

        if (k != 0 && lastDigit - k >= 0) {
            generateNumbers(currentNumber * 10 + (lastDigit - k), remainingDigits - 1, k, results);
        }
    }

     int findNumber(int n) {
        while (!isIncreasingOrDecreasing(n)) {
            n++;
        }
        return n;
    }

     boolean isIncreasingOrDecreasing(int num) {
        String str = Integer.toString(num);
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) < str.charAt(i + 1)) {
                decreasing = false;
            }
            if (str.charAt(i) > str.charAt(i + 1)) {
                increasing = false;
            }
        }

        return increasing || decreasing;
    }
    public List<List<Integer>> threeSum(int[] nums) {
        // Kết quả lưu các bộ ba thỏa mãn điều kiện
        List<List<Integer>> result = new ArrayList<>();

        // Sắp xếp mảng để dễ dàng sử dụng phương pháp hai con trỏ
        Arrays.sort(nums);

        // Duyệt qua từng phần tử trong mảng
        for (int i = 0; i < nums.length - 2; i++) {
            // Nếu phần tử hiện tại giống phần tử trước đó thì bỏ qua để tránh trùng lặp
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // Sử dụng hai con trỏ: left bắt đầu từ i + 1 và right bắt đầu từ cuối mảng
            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Tìm thấy một bộ ba có tổng bằng 0
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Di chuyển con trỏ trái để bỏ qua các phần tử trùng lặp
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Di chuyển con trỏ phải để bỏ qua các phần tử trùng lặp
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    // Di chuyển con trỏ sau khi đã bỏ qua trùng lặp
                    left++;
                    right--;
                } else if (sum < 0) {
                    // Nếu tổng nhỏ hơn 0, tăng con trỏ trái để tăng tổng
                    left++;
                } else {
                    // Nếu tổng lớn hơn 0, giảm con trỏ phải để giảm tổng
                    right--;
                }
            }
        }

        return result;
    }
}
