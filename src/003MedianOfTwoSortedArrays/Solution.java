import java.lang.Math;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        
        int totalNum = len1 + len2;
        if(totalNum == 0 ){
            return 0;
        }
        
        if(totalNum % 2 == 1) {
            return findKth(nums1, nums2, totalNum /2 + 1);
        }else{
            return (findKth(nums1, nums2, totalNum/2) + findKth(nums1, nums2, totalNum/2 +1 ) )/2;
        }
    }

    private double findKth(int [] nums1, int [] nums2, int k){

        for(int i = 0, j = 0, count = 0; i < nums1.length || j < nums2.length;) {
            if (i == nums1.length){
                return nums2[k - i - 1];
            }

            if(j == nums2.length){
                return nums1[k - j - 1];
            }
            
            count ++;
            if(count == k){
                return Math.min(nums1[i], nums2[j]);
            }

            if(nums1[i] < nums2[j]){
                i ++;
            }else{
                j ++;
            }
        }

        return 0;
    }
}
