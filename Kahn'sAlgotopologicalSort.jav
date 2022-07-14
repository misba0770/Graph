class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // Kahn's Algo(BFS)
        int[] inDegree=new int[V];
        for(int i=0;i<V;i++){
            for(Integer it:adj.get(i)){
                inDegree[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(inDegree[i]==0)q.add(i);
        } 
        int[] ans=new int[V];
    
        int ind=0;
        while(!q.isEmpty()){
            
            int x=q.poll();
           ans[ind++]=x;
            for(int it:adj.get(x)){ 
                inDegree[it]--;
                if(inDegree[it]==0)q.add(it);
              
            }
        }
    
     return ans;
    }
}
