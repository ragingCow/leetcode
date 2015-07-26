import java.util.ArrayList;
import java.util.List;

public class Solution{

    final static int RANGE = 10;
    private List<List<Integer>> resultLists = null;
    private boolean[] visit;

    void search(int count ,int k, int target, boolean[] visit,int curSum, int curIndex){

        if(curSum > target)
            return ;

        if(count > k)
            return ;

        if(curSum == target && count == k){
            List<Integer> list = new ArrayList<Integer>();
            for(int i = 1; i < RANGE; i ++){
                if(visit[i] == true){
                    list.add(i);
                }
            }
            resultLists.add(list);
            return ;
        }
        
        if(curIndex >= RANGE)
            return;

        visit[curIndex] = true;
        search(count + 1, k, target, visit, curSum + curIndex, curIndex + 1);
        visit[curIndex] = false;
        search(count, k,target, visit, curSum, curIndex + 1);
    }

    public List<List<Integer>> combinationSum3(int k, int n){
        resultLists = new ArrayList<List<Integer>>();
        visit = new boolean[RANGE];
        search(0,k, n, visit,0,1);
        return resultLists;
    }
}
