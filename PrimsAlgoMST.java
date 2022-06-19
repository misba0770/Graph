class Solution
{
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
//         for(ArrayList<ArrayList<Integer>> x:adj){
//             for(ArrayList<Integer> y:x){
//                 for(int i=0;i<y.size();i++){
//                     System.out.print(y.get(i)+" ");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
          int res=0;
       boolean[] visited = new boolean[V];
       PriorityQueue<ArrayList<Integer>> pq = new PriorityQueue<ArrayList<Integer>>((a,b)->a.get(1)-b.get(1));
       pq.add(new ArrayList<>(Arrays.asList(0,0)));
       while(!pq.isEmpty())
       {
           ArrayList<Integer> temp = pq.poll();
        //   for(int i=0;i<temp.size();i++)System.out.print(temp.get(i)+" ");
        //   System.out.println();
           int curr = temp.get(0);
           int currWt = temp.get(1);
           if(visited[curr]==false)
           {
               visited[curr]=true;
               res = res+currWt;
               for(ArrayList<Integer> i : adj.get(curr))
                   pq.add(i);
           }
       }
       return res;
    }
}
