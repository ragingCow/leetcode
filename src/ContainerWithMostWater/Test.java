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
        int nums[] = {4,1,3,4};
        int best = s.maxArea(nums);
        System.out.println(best);
    }
}
