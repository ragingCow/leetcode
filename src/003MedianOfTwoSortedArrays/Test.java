import java.lang.Math;


public class Test{
    static private void printArray(int[] nums){
        for(int x : nums){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.findMedianSortedArrays(new int[]{1,2,3}, new int[]{}));
        System.out.println(s.findMedianSortedArrays(new int[]{}, new int[]{4,5,6}));
        System.out.println(s.findMedianSortedArrays(new int[]{}, new int[]{1}));
        System.out.println(s.findMedianSortedArrays(new int[]{}, new int[]{2,3}));
    }
}
