import java.lang.Math;

public class Solution{
    int rows;
    int cols;
    boolean visitFlag[][] ;
    char[][] grid;

    public int numIslands(char[][] grid) {
        if(grid.length == 0)            
            return 0;

        rows = grid.length;
        cols = grid[0].length;
        visitFlag = new boolean[rows][cols];
        this.grid = grid;

        int islands = 0;
        for(int i = 0;  i < rows; i ++) {
            for(int j = 0; j < cols; j ++){
                if(grid[i][j] == '1' && visitFlag[i][j] == false){
                    islands ++;
                    floodFill(i, j);
                }
            }
        }
        return islands;
    }

    private void floodFill(int x, int y){
        visitFlag[x][y] = true;
        tryVisit(x - 1, y);
        tryVisit(x + 1, y);
        tryVisit(x, y - 1);
        tryVisit(x, y + 1);
    }

    private void tryVisit(int x, int y){
        if(isValidPos(x,y)&& grid[x ][y] == '1' && !visitFlag[x ][y]){
            floodFill(x , y);
        }
    }

    private boolean isValidPos(int x , int y){
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }

}
