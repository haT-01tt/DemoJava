package Ver1;

import entity.Check;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class TestSet {
    public static boolean increasingTriplet(int[] nums) {
        IntStream i = Arrays.stream(nums);
        AtomicInteger j = new AtomicInteger(Integer.MAX_VALUE);
        AtomicInteger k = new AtomicInteger(Integer.MAX_VALUE);
        return i.anyMatch(num -> {
            if (num <= j.get()) {
                j.set(num);
            } else if (num <= k.get()) {
                k.set(num);
            } else {
                return true;
            }
            return false;
        });
    }
    public static void main(String[] args) {
        int[] s1 = {1, 2, 3, 4, 5};
        System.out.println(increasingTriplet(s1));

        int[] s2 = {5, 4, 3, 2, 1};
        System.out.println(increasingTriplet(s2));

        int[] s3 = {2, 1, 5, 0, 4, 6};
        System.out.println(increasingTriplet(s3));

    }

}
