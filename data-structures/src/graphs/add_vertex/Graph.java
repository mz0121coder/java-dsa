package graphs.add_vertex;

import java.util.ArrayList;
import java.util.HashMap;


public class Graph {

    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public HashMap<String, ArrayList<String>> getAdjList() {
        return adjList;
    }

    public void printGraph() {
        System.out.println(adjList);
    }

    public boolean addVertex(String vertex) {
        if (adjList.containsKey(vertex)) {
            return false;
        } else {
            adjList.put(vertex, new ArrayList<>());
            return true;
        }
    }
}
