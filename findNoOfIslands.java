class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        int ans=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    ans++;
                    dfs(grid,i,j,n,m);
                }
            }
            
        }
        return ans;
    }
    public void dfs(char[][] grid,int i,int j,int n,int m){
        if(i<0||j<0||i>=n||j>=m)return;
        if(grid[i][j]=='0'||grid[i][j]=='2')return;
        grid[i][j]='2';
        dfs(grid,i+1,j,n,m);//D
        dfs(grid,i-1,j,n,m);//U
        dfs(grid,i,j+1,n,m);//R
        dfs(grid,i,j-1,n,m);//L
        dfs(grid,i+1,j-1,n,m);
        dfs(grid,i+1,j+1,n,m);
        dfs(grid,i-1,j+1,n,m);
        dfs(grid,i-1,j-1,n,m);
    }
}
