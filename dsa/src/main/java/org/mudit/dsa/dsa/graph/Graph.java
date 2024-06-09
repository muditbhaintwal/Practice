package org.mudit.dsa.dsa.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class Graph {
    private List<List<Edge>> graph = new ArrayList<>();

    /*
    0-->1--->2--->4
        \    \     \
         3    5 --->6
     */
    public List<List<Edge>> createGraph(int noOfVertex) {

        for (int i = 0; i < noOfVertex; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add((new Edge(0, 1)));

        graph.get(1).add((new Edge(1, 2)));
        graph.get(1).add((new Edge(1, 3)));

        graph.get(2).add((new Edge(2, 4)));
        graph.get(2).add((new Edge(2, 5)));

        graph.get(3).add((new Edge(3, 0)));

        graph.get(4).add((new Edge(4, 6)));

        graph.get(5).add((new Edge(5, 6)));

        return graph;
    }

    public static List<Integer> adjacentNodes(List<List<Edge>> graph, int vertex) {
        List<Edge> edgeList = graph.get(vertex);
        return edgeList.stream().map(Edge::getDestination).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Graph graph1 = new Graph();
        List<List<Edge>> graph = graph1.createGraph(7);
        // find adjecent nodes of given vertex
        /*List<Edge> edgeList = graph.get(2);
        adjacentNodes(graph, 2).forEach(System.out::println);*/

        // dfs
        dfs(graph);
        // bfs
        bfs(graph);
        System.out.println();
        // cycle
        hasCycle(graph);
    }

    private static void dfs(List<List<Edge>> graph) {
        System.out.println("DFS");
        int totalVertexes = graph.size();
        boolean[] visited = new boolean[totalVertexes];
        dfsUtil(graph, 0, visited);
    }

    private static void dfsUtil(List<List<Edge>> graph, int current, boolean[] visited) {
        if (visited[current]) {
            return;
        }
        visited[current] = true;
        System.out.print("visited " + current + " --> ");
        for (Integer node : adjacentNodes(graph, current)) {
            dfsUtil(graph, node, visited);
        }
    }

    private static void bfs(List<List<Edge>> graph) {
        System.out.println();
        System.out.println("BFS");
        //track visited vertexes
        int totalVertexes = graph.size();
        boolean[] visited = new boolean[totalVertexes];

        //track adjacent vertexes
        Queue<Integer> queue = new LinkedList();
        queue.add(0); //start with source
        bfsUtil(graph, visited, queue);
    }

    private static void bfsUtil(List<List<Edge>> graph, boolean[] visited, Queue<Integer> queue) {
        while (!queue.isEmpty()) {
            Integer vertex = queue.poll();
            if (visited[vertex]) {
                return;
            }
            visited[vertex] = true;
            System.out.print("visited " + vertex + " --> ");
            for (Integer adjacentNode : adjacentNodes(graph, vertex)) {
                queue.add(adjacentNode);
            }
            bfsUtil(graph, visited, queue);
        }
    }

    private static void hasCycle(List<List<Edge>> graph) {
        //keep track of visited vertexes
        int totalVertexes = graph.size();
        boolean[] visited = new boolean[totalVertexes];

        // keep track of CURRENT path
        boolean[] currentPath = new boolean[totalVertexes];
        boolean cycleFound = false;

        for (int i = 0; i < graph.size(); i++) {
            cycleFound = cycleUtil(graph, visited, currentPath, i);
            if (cycleFound) {
                break;
            }
        }

        System.out.println("cycle found " + cycleFound);

    }

    private static boolean cycleUtil(List<List<Edge>> graph, boolean[] visited, boolean[] currentPath, int currentVertex) {
        visited[currentVertex] = true;
        currentPath[currentVertex] = true;

        for (Integer node : adjacentNodes(graph, currentVertex)) {
            if (currentPath[node]) { // destination node is already in current path
                return true; // cycle detected
            }
            if (!visited[node]) {
                if (cycleUtil(graph, visited, currentPath, node)) {
                    return true;
                }
            }

        }

        currentPath[currentVertex] = false;
        return false;
    }
}


class Edge {
    int source;
    int destination;

    public Edge(int source, int destination) {
        this.source = source;
        this.destination = destination;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }
}
