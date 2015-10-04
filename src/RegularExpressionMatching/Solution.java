import java.lang.Math;

public class Solution{

    public boolean isMatch(String s, String p) {
        if(s.length() == 0) {
            return tryMatchRestLetterInP(p,p.length() - 1);
        }

        if(p.length() == 0){
            return false;
        }
        
        p = deleteRedundantStar(p);

        return tryMatch(s,s.length() - 1,p,p.length() - 1);    
    }
    
    private boolean tryMatch(String s, int sIndex, String p, int pIndex){
        if(sIndex < 0 && pIndex < 0){
            return true;
        }

        if(pIndex < 0){
            return false;
        }

        if(sIndex < 0){
            return tryMatchRestLetterInP(p, pIndex);
        }
        
        if(p.charAt(pIndex) == '.'){
            return tryMatch(s, sIndex - 1, p, pIndex - 1);
        }

        if(Character.isLetter(p.charAt(pIndex))){
            return p.charAt(pIndex) == s.charAt(sIndex) ? tryMatch(s,sIndex -1 , p, pIndex - 1): false;
        }

        //p.charAt(pIndex) == '*'
        boolean ret = tryMatch(s,sIndex, p, pIndex - 2);
        if(ret == true){
            return true;
        }
        
        int i = sIndex;
        for(; i >= 0 && (s.charAt(i) == p.charAt(pIndex - 1) || p.charAt(pIndex - 1) == '.'); i --){
            ret = tryMatch(s, i - 1, p, pIndex - 2); 
            if(ret == true){
                return true;
            }
        }
        
        return false; 
    }

    //like c*a*...
    private boolean tryMatchRestLetterInP(String p, int index){
        if(index == -1){
            return true;
        }

        if(index % 2 != 1){
            return false;
        }

        for(int i = index;i >= 0 ; i -= 2){
            if(p.charAt(i) != '*') {
                return false;
            }
        }
        return true;
    }

    private String deleteRedundantStar(String str){
        String ret = "";
        for(int i = 0; i < str.length(); i ++){
            if( i ==0 && str.charAt(i) == '*' || str.charAt(i) == '*' && i != 0  && str.charAt(i - 1) == '*'){
                continue;
            }
            ret += str.charAt(i);
        }
        
        return str;
    }
}
