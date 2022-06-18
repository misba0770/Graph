class Solution
{
     public boolean dfsCheck(int node,ArrayList<ArrayList<Integer>>adj,int[] color){
         if(color[node]==-1)color[node]=1;
         for(int it:adj.get(node)){
             if(color[it]==-1){
                 color[it]=1-color[node];
                if(!dfsCheck(it,adj,color))return false;
             }
             else if (color[it]==color[node])
             return false;
         }
         return true;
     }

    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int[] color=new int[V];
        for(int i=0;i<V;i++){
            color[i]=-1;
        }
        for(int i=0;i<V;i++){
            if(color[i]==-1){
                if(!dfsCheck(i,adj,color))return false;
            }
        }
        return true;
    }
    public boolean bfsCheck(int node,ArrayList<ArrayList<Integer>>adj,int[] color){
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        color[node]=1;
        while(!q.isEmpty()){
            int x=q.poll();
            for(Integer it:adj.get(x)){
                if(color[it]==-1){
                    q.add(it);
                    if(color[x]==0)color[it]=1;
                    else color[it]=0;
                }
                else{
                    if(color[it]==color[x])return false;
                }
            }
        }
        return true;
    }
}
