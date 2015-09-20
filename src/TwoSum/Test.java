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
        int nums[] = {-3,2,3,8};
        int ret[] = s.twoSum(nums, 0);
        System.out.println(ret[0] +" "+ ret[1]);
    }
}
