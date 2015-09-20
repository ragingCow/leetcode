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
        System.out.println(s.isAnagram("hello", "llohe"));
        System.out.println(s.isAnagram("", ""));
        System.out.println(s.isAnagram("a", "b"));
    }
}
