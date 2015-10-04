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
        System.out.println(s.lengthOfLongestSubstring("aabbcc"));
        System.out.println(s.lengthOfLongestSubstring("abc"));
        System.out.println(s.lengthOfLongestSubstring("a"));
        System.out.println(s.lengthOfLongestSubstring(""));
        System.out.println(s.lengthOfLongestSubstring("abcdcba"));
    }
}
