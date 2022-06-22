class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int x=image.length;
        int y=image[0].length;
        int oldColour=image[sr][sc];
        int[][] vis=new int[x][y];
        dfs(sr,sc,image,vis,x,y,oldColour,color);
        return image;
    }
    public void dfs(int sr,int sc,int[][] image,int[][] vis,int x,int y,int old,int newC){
        if(sr<0||sc<0||sr>=x||sc>=y)return;
        if(vis[sr][sc]==1||image[sr][sc]!=old)return;
        
        vis[sr][sc]=1;
        image[sr][sc]=newC;
        dfs(sr+1,sc,image,vis,x,y,old,newC);
        dfs(sr-1,sc,image,vis,x,y,old,newC);
        dfs(sr,sc+1,image,vis,x,y,old,newC);
        dfs(sr,sc-1,image,vis,x,y,old,newC);
        
    }
}
