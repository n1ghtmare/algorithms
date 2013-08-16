
package Graphs;

/**
 *
 * @author dimitar
 */
public class BreathFirstPaths {
    private boolean[] visited;
    private int[] edgeTo;
    private final int source;
    
    public BreathFirstPaths(Graph g, int source){
        this.source = source;
        visited = new boolean[g.getVertices()];
        edgeTo = new int[g.getVertices()];
        bfs(g, source);
    }
    
    private void bfs(Graph g, int vertex){
        Queue<Integer> q = new Queue<Integer>();
        visited[vertex] = true;
        q.enqueue(vertex);
        
        while(!q.isEmpty()){
            // remove the next vertex from the queue
            int currentVertex = q.dequeue();
            for(int adjacentVertex : g.adjacent(vertex)){
                if(!visited[adjacentVertex]){
                    visited[adjacentVertex] = true;
                    edgeTo[adjacentVertex] = currentVertex;
                    // next to visit (all siblings)
                    q.enqueue(adjacentVertex);
                }
            }
        }
    }
    
    public boolean hasPathTo(int vertex){
        return visited[vertex];
    }
    
    public Iterable<Integer> pathTo(int vertex){
        if(hasPathTo(vertex)){
            LinkedList<Integer> path = new LinkedList<Integer>();
            while(vertex != source){
                path.append(vertex);
                // move to the next vertex that is connected
                vertex = edgeTo[vertex];
            }
            path.append(source);
            return path;
        }
        return null;
    }
}
