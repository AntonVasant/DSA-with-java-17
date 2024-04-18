package dsa;

public class MedianOfTwoSortedArray {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int totalLength = nums1.length + nums2.length;
            int mid = totalLength / 2;
            boolean isEven = totalLength % 2 == 0;

            int index1 = 0, index2 = 0;
            int prev = 0, curr = 0;

            for (int i = 0; i <= mid; i++) {
                prev = curr;
                if (index1 < nums1.length && (index2 >= nums2.length || nums1[index1] <= nums2[index2])) {
                    curr = nums1[index1++];
                } else {
                    curr = nums2[index2++];
                }
            }

            if (isEven) {
                return (prev + curr) / 2.0;
            } else {
                return curr;
            }
        }

}
