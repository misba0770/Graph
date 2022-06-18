class Node{
    int first;
    int second;
    Node(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                if(check(i,vis,adj))return true;
            }
        }
        return false;
    }
    public boolean check(int node,boolean[] vis,ArrayList<ArrayList<Integer>> adj){
        Queue<Node> q=new LinkedList<>();
        q.add(new Node(node,-1));
        vis[node]=true;
        while(!q.isEmpty()){
            int x=q.peek().first;
            int par=q.peek().second;
            q.poll();
            for(int it:adj.get(x)){
                if(vis[it]==false){
                    vis[it]=true;
                    q.add(new Node(it,x));
                }
                else if(par!=it)return true;
            }
            
        }
        return false;
    }
}
