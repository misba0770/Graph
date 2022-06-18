class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
      boolean vis[]=new boolean[V+1];
      ArrayList<Integer> ans=new ArrayList<>();
      for(int i=0; i<V; i++){ 
            if(vis[i]==false){
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                vis[i] = true;
                
                while(!q.isEmpty()){
                    Integer node = q.poll();
                    ans.add(node);
                    for(Integer it : adj.get(node)){
                        if(vis[it]==false){
                            vis[it]=true;
                            q.add(it);
                            
                        }
                    }
                }  
            }
            break;
            
        }
       // return bfs;
      return ans;
      
    }
}
