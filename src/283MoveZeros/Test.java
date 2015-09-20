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
        int nums[] = {0,1,2,0,3,4,5,0,0,0};
        s.moveZeroes(nums);
        printArray(nums);
        System.out.println(nums);
    }
}
