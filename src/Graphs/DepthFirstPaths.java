package Graphs;

public class DepthFirstPaths {
    private boolean[] visited;
    private int[] edgeTo;
    private final int source;
    
    public DepthFirstPaths(Graph graph, int source){
        this.source = source;
        visited = new boolean[graph.getVertices()];
        edgeTo = new int[graph.getVertices()];        
        dfs(graph, source);
    }
    
    // process the graph
    private void dfs(Graph graph, int vertex){
        if(!visited[vertex]){
            visited[vertex] = true;
            for(int adjacentVertex : graph.adjacent(vertex)){
                if(!visited[adjacentVertex]){
                    edgeTo[adjacentVertex] = vertex;
                    dfs(graph, adjacentVertex);
                }
            }
        }
    }
    
    public boolean hasPathTo(int vertex){
        return visited[vertex];
    }
    
    public Iterable<Integer> pathTo(int vertex){
        if(!hasPathTo(vertex)){
            return null;
        }
        
        LinkedList<Integer> path = new LinkedList<Integer>();
        // start from the source and move back to all the edges connected
        while(vertex != source){
            path.append(vertex);
            // move to the next vertex that is connected
            vertex = edgeTo[vertex];
        }
        path.append(source);        
        return path;
    }
}
