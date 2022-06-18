class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                if(check(i,-1,vis,adj))return true;
            }
        }
        return false;
    }
    public boolean check(int node,int parent,boolean[] vis,ArrayList<ArrayList<Integer>> adj){
       
        vis[node]=true;
        
            for(int it:adj.get(node)){
                if(vis[it]==false){
                   // vis[it]=true;
                   if( check(it,node,vis,adj))return true;
                }
                else if(parent!=it)return true;
            }
            
        
        return false;
    }
}
