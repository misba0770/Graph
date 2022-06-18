class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int vis[]=new int[V];
        int dfsVisit[]=new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                if(check(i,adj,vis,dfsVisit))return true;
            }
        }
        return false;
    }
    public boolean check(int i,ArrayList<ArrayList<Integer>> adj,int[] vis,int[] dfsVisit){
        vis[i]=1;
        dfsVisit[i]=1;
        for(int it:adj.get(i)){
            if(vis[it]==0){
                if(check(it,adj,vis,dfsVisit))return true;
            }
            else {
                if(dfsVisit[it]==1)return true;
            }
        }
        dfsVisit[i]=0;
        return false;
    }
}
