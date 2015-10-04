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
        System.out.println(s.convert("PAYPALISHIRING", 3));
        System.out.println(s.convert("AB", 1));
    }
}
