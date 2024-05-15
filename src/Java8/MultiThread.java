package Java8;

import java.util.Arrays;
import java.util.Random;

public class MultiThread {


    private static int totalSum = 0;

    public static void main(String[] args) {
        // Tạo một mảng số nguyên lớn với các giá trị ngẫu nhiên từ 1 đến 10
        int[] bigArray = createRandomArray(1000000, 1, 10);

        // Tính tổng của mảng theo cách tuần tự
        int sequentialSum = computeSequentialSum(bigArray);
        System.out.println("Tổng của mảng tính theo cách tuần tự là: " + sequentialSum);

        // Số luồng để thực hiện tính toán song song
        int numThreads = 10;

        // Chia mảng thành các phần nhỏ tương ứng với số luồng
        int chunkSize = bigArray.length / numThreads;

        // Tạo và khởi chạy các luồng
        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            final int threadIndex = i;
            threads[i] = new Thread(() -> {
                int start = threadIndex * chunkSize;
                int end = (threadIndex == numThreads - 1) ? bigArray.length : (threadIndex + 1) * chunkSize;
                int sum = computeSum(bigArray, start, end);
                System.out.println("Tổng của phần từ " + threadIndex + ": " + sum);
                addToTotalSum(sum);
            });
            threads[i].start();
        }

        // Chờ cho tất cả các luồng hoàn thành
        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Tổng của mảng là: " + totalSum);
    }

    // Phương thức tính tổng của một phần của mảng
    public static int computeSum(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }

    // Phương thức tính tổng của mảng theo cách tuần tự
    public static int computeSequentialSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // Phương thức tạo một mảng số nguyên ngẫu nhiên
    public static int[] createRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    // Phương thức thêm tổng của một phần vào tổng chung của mảng
    public synchronized static void addToTotalSum(int sum) {
        totalSum += sum;
    }
}
