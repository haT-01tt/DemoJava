package Exercise;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i< nums.length -1 ; i++){
            for (int j = i + 1; j < nums.length ; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] y = {1,2,3,4,5,6};
        int target = 13;
        System.out.println(Arrays.toString(twoSum(y, target)));
    }
}
