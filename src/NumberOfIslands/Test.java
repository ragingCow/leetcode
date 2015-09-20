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
        char array[][] = {
//            {'1','1','1','1','0'},
//            {'1','1','1','1','0'},
//            {'1','1','1','1','0'},
//            {'1','1','1','1','0'},
        };
        System.out.println(s.numIslands(array));
    }
}
