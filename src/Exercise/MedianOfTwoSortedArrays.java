package Exercise;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        if (totalLength % 2 == 0) {
            return (findKthElement(nums1, nums2, totalLength / 2) +
                    findKthElement(nums1, nums2, totalLength / 2 - 1)) / 2.0;
        } else {
            return findKthElement(nums1, nums2, totalLength / 2);
        }
    }

    private double findKthElement(int[] nums1, int[] nums2, int k) {
        int index1 = 0, index2 = 0;
        while (true) {
            if (index1 == nums1.length) {
                return nums2[index2 + k];
            }
            if (index2 == nums2.length) {
                return nums1[index1 + k];
            }
            if (k == 0) {
                return Math.min(nums1[index1], nums2[index2]);
            }

            int halfK = (k + 1) / 2;
            int newIndex1 = Math.min(index1 + halfK, nums1.length) - 1;
            int newIndex2 = Math.min(index2 + halfK, nums2.length) - 1;
            if (nums1[newIndex1] <= nums2[newIndex2]) {
                k -= (newIndex1 - index1 + 1);
                index1 = newIndex1 + 1;
            } else {
                k -= (newIndex2 - index2 + 1);
                index2 = newIndex2 + 1;
            }
        }
    }
}
