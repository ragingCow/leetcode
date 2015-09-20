import java.lang.Math;

public class Solution{

    final int ALPHA_NUM = 26;

    public boolean isAnagram(String s, String t){
        if(s.length() != t.length())
            return false;

        int countS[] = new int[ALPHA_NUM];
        int countT[] = new int[ALPHA_NUM];

        countString(s,countS);
        countString(t,countT);
        return compare(countS, countT); 
    }

    private boolean compare(int[]s, int [] t){
        for(int i = 0 ; i < ALPHA_NUM; i ++){
            if(s[i] != t[i])
                return false;
        }
        return true;
    }

    private void countString(String s, int array[]){
        for(int i = 0; i < s.length(); i ++){
            int ix = s.charAt(i) - 'a';
            array[ix] += 1;
        }
    }
}

