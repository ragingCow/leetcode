import java.lang.Math;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if(length == 0){
            return 0;
        }

        int maxSubLength[] = new int[length];
        int maxLength = 1;
        maxSubLength[0] = 1;

        for(int i= 1; i < length; i ++){
            
            int preLen = maxSubLength[i - 1];
            int j = 0;
            for(; j < preLen; j ++){
                if(s.charAt(i) != s.charAt(i - j - 1)){
                    continue;
                }
                break;
            }
            maxSubLength[i] = j + 1;
            if(maxSubLength[i] > maxLength){
                maxLength = maxSubLength[i];
            }
        }
        return maxLength;
    }
}
