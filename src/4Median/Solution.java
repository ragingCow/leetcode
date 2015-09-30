import java.lang.Math;

public class Solution{

    public static void main(String[] args){
        Solution s = new Solution();
        int nums1[] = {1,2,3,4,5};
        int nums2[] = {2,3,4};

        System.out.println(s.findMedian(nums1,0,4, nums2, 0, 2, 1));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        return 0.1  ;
    }

    private int findMedian(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k){
        System.out.println( " start1:" + start1 + " end1:" + end1 +
                            " start2:" + start2 + " end2:" + end2 + "  k:" + k
                );

        if(start1 > end1){
            return nums2[end1 - k + 1];
        }
        if(start2 > end2){
            return nums1[end2 - k + 1];
        }

        int median1 = (start1 + end1)/2;
        int median2 = (start2 + end2)/2;
        int rightCount = end1 - median1  + 1 + end2 - median2 + 1;
        
        int ret = 0;
        if(k == rightCount ){
            ret =  Math.min(nums1[median1], nums2[median2]);
        }else if(k < rightCount ){
            ret = findMedian(nums1, median1, end1, nums2, median2, end2, k);
        }else{
            if(nums1[median1] >= nums2[median2]){
                ret = findMedian(nums1,start1, median1,nums2, start2, end2, k - (end1 - median1));
            }else{
                ret = findMedian(nums1,start1, end1, nums2, start2,median2, k - (end1 - median1));
            }
        }
        return ret;
    }
    
}
