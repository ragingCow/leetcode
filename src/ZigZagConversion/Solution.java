PAYPALISHIRINGimport java.lang.Math;

public class Solution{

    public String convert(String s, int numRows) {
        if(s.length() <= numRows || numRows == 1){
            return s;
        }

        String ret = "";
        int intervalRow[] = new int[numRows];

        for(int i = 0; i < numRows; i ++){
            intervalRow[i] = (numRows - i  - 1) * 2 ;
        }
        
        for(int j = 0; j < s.length(); j += intervalRow[0]){
            ret += s.charAt(j);    
        }

        for(int i = 1; i < numRows - 1; i ++){
            int interval1 = intervalRow[i]; 
            int interval2 = intervalRow[numRows - i -1];

            int cnt = 0;
            for(int j = i; j < s.length();){
                ret += s.charAt(j);
                if(cnt % 2 == 0){
                    j += interval1;
                }else{
                    j += interval2;
                }
                cnt ++;
            }
        }

        for(int j = numRows - 1; j < s.length(); j += intervalRow[0]){
            ret += s.charAt(j);    
        }
        return ret;
    }

}
