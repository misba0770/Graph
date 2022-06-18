class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans=new ArrayList<>();
        boolean[] vis=new boolean[V];
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                dfs(i,vis,adj,ans);
            }
        }
        return ans;
    }
    public void dfs(int node,boolean[] vis,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans){
        ans.add(node);
        vis[node]=true;
        for(int i:adj.get(node)){
            if(vis[i]==false){
                dfs(i,vis,adj,ans);
            }
        }
    }
}
