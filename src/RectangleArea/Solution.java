import java.lang.Math;

public class Solution{
    
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H){
        return (C - A ) * (D - B) + (G - E) * (H - F) - computeCommonArea(A, B, C, D, E, F, G ,H);
    }

    public int computeCommonArea(int A, int B, int C, int D, int E, int F, int G, int H){
        if(C <= E || A >= G || D <= F || B >= H)
            return 0;
       
        int x1 = Math.max(A, E);
        int x2 = Math.min(C, G);
        int y1 = Math.max(B, F);
        int y2 = Math.min(D, H);

        int commonArea = (x2 - x1) * (y2 - y1);
        return commonArea; 
    }

    
}
