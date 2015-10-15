import java.lang.Math;

public class Solution{
    public int maxArea(int[] height) {
        int length = height.length;

        int left =0, right = length - 1;
        int best = 0;
        while(left < right){
            int area = (right - left) * Math.min(height[left], height[right]); 
            if(area > best){
                best = area;
            }
            if(height[left] < height[right]){
                left ++;
            }else{
                right --;
            }
        }
        return best;
    }

}
