package Exercise;

public class LeetCode35 {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            else if (nums[i] > target){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        LeetCode35 leetCode35 = new LeetCode35();
        int[] nums = {1, 3, 5, 6, 8};
        int target = 7;
        System.out.println("\nOutput: " + leetCode35.searchInsert(nums, target));
    }
}
