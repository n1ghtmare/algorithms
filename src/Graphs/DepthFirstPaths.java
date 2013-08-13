/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphs;

/**
 *
 * @author dimitar
 */
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
        while(vertex != source){
            path.append(vertex);
            vertex = edgeTo[vertex];
        }
        path.append(source);        
        return path;
    }
}
