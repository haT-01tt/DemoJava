package Exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<= nums.length -1 ; i++){
            int num = target - nums[i];
            if(map.containsKey(num)){
                return new int[]{map.get(num), i};
            }
            map.put(nums[i], i);

        }
        return null;
    }

    public static void main(String[] args) {
        int[] y = {0,4,3,0};
        int target = 0;
        System.out.println(Arrays.toString(twoSum(y, target)));
    }
}
