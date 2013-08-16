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
        Graph g = new Graph(10);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(4, 7);
        g.addEdge(7, 6);
        g.addEdge(6, 5);
        g.addEdge(5, 9);
                
        DepthFirstPaths p = new DepthFirstPaths(g, 0);
        System.out.println(p.hasPathTo(0));
        
        for(int path : p.pathTo(9)){
            System.out.println(path);
        }
    }
}
