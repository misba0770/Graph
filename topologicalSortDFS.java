class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        int[] visited=new int[V];
        int[] ans=new int[V];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<V;i++){
           if(visited[i]==0) dfs(i,visited,adj,st);
        }
        int c=0;
       while(!st.isEmpty())ans[c++]=st.pop();
        return ans;
    }
    static void dfs(int node,int[] visit,ArrayList<ArrayList<Integer>> adj,Stack<Integer> st){
        visit[node]=1;
        for(int it:adj.get(node)){
            if(visit[it]==0)dfs(it,visit,adj,st);
        }
        st.push(node);
        
    }
}
