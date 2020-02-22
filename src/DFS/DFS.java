package DFS;

import graphs.DirectedGraph;

public class DFS {
    public static void main(String[] args) {

        DirectedGraph graph = new DirectedGraph(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        graph.DFS(2);
    }
}
