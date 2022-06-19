 class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        int dist[] = new int[V];
         boolean fin[] = new boolean[V];
         Arrays.fill( dist, Integer.MAX_VALUE);
         PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
         pq.offer(new int[]{S,0});
         dist[S] = 0;
         while( !pq.isEmpty()){
             int[] cur = pq.poll();
             fin[cur[0] ]= true;
             int wei = cur[1];
             for( ArrayList<Integer> x : adj.get(cur[0])){
                if(!fin[ x.get(0) ] && dist[ x.get(0) ] >  wei + x.get(1)){
                   dist[ x.get(0) ] =  wei + x.get(1) ;
                   pq.offer( new int[]{ x.get(0), dist[ x.get(0) ]});
                }
              }
           }
        return dist;
    }
}
