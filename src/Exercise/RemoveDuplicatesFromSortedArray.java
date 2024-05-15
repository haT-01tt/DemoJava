package Exercise;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        // Kiem tra do dai cua mang
        if (nums.length == 0) return 0;
        // tao 1 index trong mang
        int i = 0;
        // Duyet qua mang
        for (int j = 1; j < nums.length; j++) {
            // Duyet tung phan tu trong mang
            // Neu no khac thi khong phai trung lap
            // gan gia tri i = j vi num[i] se bang gia tri hien tai so sanh voi gia tri sau
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2};
        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(nums));
    }
}
