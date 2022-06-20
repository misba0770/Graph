class Solution
{
    public void dfs(int node,Stack<Integer> st,ArrayList<ArrayList<Integer>> adj,int[] vis){
        vis[node]=1;
        for(Integer it:adj.get(node)){
            if(vis[it]==0)dfs(it,st,adj,vis);
           
        }
        st.push(node);
        
    }
    public void revDfs(int node,ArrayList<ArrayList<Integer>> transpose,int vis[]){
        vis[node]=1;
        for(Integer it:transpose.get(node)){
            if(vis[it]==0)revDfs(it,transpose,vis);
        }
    }
    //Function to find number of strongly connected components in the graph.
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        //code here
        int[] vis=new int[V];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                dfs(i,st,adj,vis);
            }
        }
        ArrayList<ArrayList<Integer>> transpose=new ArrayList<>();
        for(int i=0;i<V;i++){
            transpose.add(new ArrayList<Integer>());
        }
        for(int i=0;i<V;i++){
            vis[i]=0;
            for(Integer it:adj.get(i)){
                transpose.get(it).add(i);
            }
        }
        int c=0;
        while(st.size()>0){
            int node=st.peek();
            st.pop();
            if(vis[node]==0){
                revDfs(node,transpose,vis);
                c++;
                
            }
        }
        return c;
        
    }
}
