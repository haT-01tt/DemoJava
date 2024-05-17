package Exercise;

import java.util.HashMap;

public class LeetCode27 {
    public int removeElement(int[] nums, int val) {
       int k = 0;
       for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[k] = nums[i];
                    k++;
                }
            }
        return k;
    }

    public static void main(String[] args) {
        LeetCode27 leetCode27 = new LeetCode27();
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println("\nOutput: " + leetCode27.removeElement(nums, val));
    }
}
