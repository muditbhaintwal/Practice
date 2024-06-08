package org.mudit.dsa.dsa.graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<List<Edge>> graph = new ArrayList<>();

    public List<List<Edge>> createGraph(int noOfVertex) {

        for (int i = 0; i < noOfVertex; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add((new Edge(0, 2)));

        graph.get(1).add((new Edge(1, 2)));
        graph.get(1).add((new Edge(1, 3)));

        graph.get(2).add((new Edge(2, 3)));
        graph.get(2).add((new Edge(2, 1)));

        graph.get(3).add((new Edge(3, 1)));
        graph.get(3).add((new Edge(3, 2)));
        return graph;
    }

    public void adjacentNodes(List<List<Edge>> graph) {

    }

    public static void main(String[] args) {
        Graph graph1 = new Graph();
        List<List<Edge>> graph = graph1.createGraph(4);
        // find adjecent nodes of given vertex
        List<Edge> edgeList = graph.get(3);
        edgeList.forEach(e -> System.out.println(e.getDestination()));
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
