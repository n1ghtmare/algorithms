/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphs;

/**
 *
 * @author dimitar
 */
public class Graph {
    private final int vertices;
    private int edges;
    private LinkedList<Integer>[] lists;
        
    public Graph(int vertices){
        this.vertices = vertices;
        lists = (LinkedList<Integer>[]) new LinkedList[vertices];
        
        for(int i = 0; i < this.vertices;i++){
            lists[i] = new LinkedList<Integer>();
        }
    }
    
    public void addEdge(int startVertex, int endVertex){
        // need to add it to both lists since the connection/edge 
        // is between both and has to show up in both's adjacent vertices
        lists[startVertex].appendToTail(endVertex);
        lists[endVertex].appendToTail(startVertex);
        edges++;
    }
    
    public int getEdges(){
        return edges;
    }
    
    public int getVertices(){
        return vertices;
    }
    
    public Iterable<Integer> adjacent(int vertex) {
        return lists[vertex];
    }
}
