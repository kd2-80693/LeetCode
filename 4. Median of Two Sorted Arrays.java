class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;   
        int fal = nums1.length;          
        int sal = nums2.length;     
        int[] merged = new int[fal + sal];  
        System.arraycopy(nums1, 0, merged, 0, fal);  
        System.arraycopy(nums2, 0, merged, fal, sal);  
        Arrays.sort(merged);
        if (merged.length == 1) {
            return merged[0];
        } else if (merged.length % 2 == 0) { 
            result = ((double) (merged[merged.length / 2] + merged[(merged.length / 2) - 1]) / 2);
        } else {
            result = merged[merged.length / 2];
        }
        return result;
    }
}
