package graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class DirectedGraph {

    // representing the directed graph
    private int numOfVertices;
    private LinkedList<Integer> adjList[];
    public DirectedGraph(int numOfVertices) {
        this.numOfVertices = numOfVertices;
        adjList = new LinkedList[numOfVertices];

        for (int i = 0; i < numOfVertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // method for adding an edge into the graph
    public void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    // method used by dfs
    public void DFSUtil(int v, boolean[] visited) {

        visited[v] = true;
        System.out.print(v +" -> ");
        Iterator<Integer> iterator = adjList[v].listIterator();
        while (iterator.hasNext()) {
            int n = iterator.next();
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    //method for dfs
    public void DFS(int v) {
        boolean[] visited = new boolean[numOfVertices];
        DFSUtil(v, visited);
    }
}
