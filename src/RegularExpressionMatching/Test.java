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
        System.out.println(s.isMatch("aa","a"));
        System.out.println(s.isMatch("aa","aa"));
        System.out.println(s.isMatch("aaa","aa"));
        System.out.println(s.isMatch("aa","a*"));
        System.out.println(s.isMatch("aa",".*"));
        System.out.println(s.isMatch("ab",".*"));
        System.out.println(s.isMatch("aaa","aaaa"));
        System.out.println(s.isMatch("aab","c*a*b"));
        System.out.println(s.isMatch("","."));
        System.out.println(s.isMatch("",""));
    }
}
