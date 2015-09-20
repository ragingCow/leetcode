import java.lang.Math;
import java.util.Set;
import java.util.HashSet;


public class Solution{
    
    public int[] twoSum(int[] nums, int target) {
        int ret[] = new int[2];
        Set<Integer> set = new HashSet<Integer>();            
        for(int i = 0; i < nums.length;i ++){
                if(set.contains(new Integer(target - nums[i]))){
                    ret[0] = find(nums,target - nums[i]) + 1;
                    ret[1] = i + 1;
                    break;
                }else{
                    set.add(new Integer(nums[i]));
                }
        }
        return ret;
    }

    private int find(int[] nums, int x){
        for(int i= 0;i < nums.length; i ++){
            if(nums[i] == x)
                return i;
        }
        return -1;
    }
}
