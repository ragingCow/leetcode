import java.lang.Math;

public class Solution{

    Solution(){

    }

    public void moveZeroes(int[] nums){
        int firstZeroPos;
        int firstNonZeroPos  ;

        while(true){
            firstZeroPos = findNextZero(nums, 0);
            if(firstZeroPos == -1)
                break;
            firstNonZeroPos = findNextNonZero(nums, firstZeroPos + 1);
            if( firstNonZeroPos == -1)
                break;
            swap(nums, firstZeroPos, firstNonZeroPos);
        }
    }

    private void swap(int array[], int ix1, int ix2){
        int t = array[ix1];
        array[ix1] = array[ix2];
        array[ix2] = t;
    }

    private int findNextZero(int nums[], int pos){
        for(int i = pos; i < nums.length; i ++){
            if(nums[i] == 0)
                return i;
        }
        return -1;
    }

    private int findNextNonZero(int nums[], int pos){
        for(int i = pos; i < nums.length; i ++){
            if(nums[i] != 0)
                return i;
        }
        return -1;
    }


}
