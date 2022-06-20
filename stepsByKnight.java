class Solution
{
    class Pair{
        int x;
        int y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public boolean isValid(int x,int y,int n,int[][] visit){
        if(x>=0&&y>=0&&x<n&&y<n&&visit[x][y]==0)return true;
        return false;
    }
    //Function to find out minimum steps Knight needs to reach target position.
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int n)
    {
        // Code here
        int tx=TargetPos[0]-1;
        int ty=TargetPos[1]-1;
        
        int kx=KnightPos[0]-1;
        int ky=KnightPos[1]-1;
        if(tx==kx&&ty==ky)return 0;
        Queue<Pair> q=new LinkedList<>();
        int[][] visit=new int[n][n];
        visit[kx][ky]=1;
        q.add(new Pair(kx,ky));
        int ans=0;
        
        while(!q.isEmpty()){
            ans++;
            int size=q.size();
            while(size>0){
                Pair p=q.poll();
                int xx=p.x;
                int yy=p.y;
                int ax[]={1,1,-1,-1,2,-2,2,-2};
                int ay[]={2,-2,2,-2,1,-1,-1,1};
                for(int i=0;i<8;i++){
                    int nx=xx+ax[i];
                    int ny=yy+ay[i];
                    if(nx==tx&&ny==ty)return ans;
                    if(isValid(nx,ny,n,visit)){
                        visit[nx][ny]=1;
                        q.add(new Pair(nx,ny));
                    }
                }
                size--;
            }
        }
        
        
        return ans;
        
    }
    
}
