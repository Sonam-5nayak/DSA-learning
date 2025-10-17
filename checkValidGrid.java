class Solution {
    public boolean checkValidGrid(int[][] grid) {
        int count=0;
        dfs(0,0,grid,count); 
        for(int[] a:grid)
            for(int i:a)
                if(i!=-1) return false;
        return true;
    }
    void dfs(int i, int j, int[][] grid,int count){
        if(i<0 || j<0 || i>=grid[0].length || j>=grid.length || grid[i][j]!=count) return ;
        grid[i][j]=-1;
        dfs(i-2,j-1,grid,count+1);
        dfs(i-1,j-2,grid,count+1);
        dfs(i-2,j+1,grid,count+1);
        dfs(i-1,j+2,grid,count+1);
        dfs(i+2,j+1,grid,count+1);
        dfs(i+1,j+2,grid,count+1);
        dfs(i+2,j-1,grid,count+1);
        dfs(i+1,j-2,grid,count+1);
    }
}
