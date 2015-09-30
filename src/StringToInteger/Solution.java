import java.lang.Math;

public class Solution{
    public int myAtoi(String str) {
        Long value;
        try{
            String digit = preDeal(str);

            for(int i = 10; i < digit.length(); i ++){
               long tempValue = Long.valueOf(digit.substring(0,i));
               if(tempValue > 2147483647){
                    return 2147483647;
               }
               if(tempValue < (-2147483648)){
                    return  -2147483648;
               }
            }
            value = Long.valueOf(digit);
        }catch(Exception e){
            return 0;
        }
        
        if(value > 2147483647)
            return 2147483647;

        if(value < -2147483648)
            return -2147483648;

        return (int)(long)value;
    }

    private String preDeal(String digit){
        String ret= "" ;
        digit = digit.trim();
        if(digit.charAt(0) == '-' || digit.charAt(0) == '+' || Character.isDigit(digit.charAt(0))){
            ret += digit.charAt(0);
        }else{
            return "";
        }

        for(int i = 1; i < digit.length(); i ++){
            if(Character.isDigit(digit.charAt(i))){
                ret += digit.charAt(i);
            }else{
               return ret; 
            }
        }
        return ret;
    }
}
