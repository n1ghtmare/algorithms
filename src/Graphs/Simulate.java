/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphs;

/**
 *
 * @author dimitar
 */
public class Simulate {
    public static void main(String[] args){
        Graph g = new Graph(100);
        g.addEdge(1, 5);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(3, 5);
        
        for(int adjacent : g.adjacent(1)){
            System.out.println(adjacent);
        }
    }
}
