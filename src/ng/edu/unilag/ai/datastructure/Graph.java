package ng.edu.unilag.ai.datastructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Graph<T> {
    private Collection<Edge<T>> edges;
    private Collection<Node<T>> nodes;

    public Graph(Collection<Node<T>> nodes)
    {
        this.nodes = nodes;
        this.edges =  Collections.emptyList();
    }

    public Graph(Collection<Node<T>> nodes, Collection<Edge<T>> edges)
    {
        this.nodes = nodes;
        this.edges = edges;
    }

    public void addNode(Node <T> node)
    {
        this.nodes.add(node);
    }

    public void addNode(Collection<Node<T>> nodes)
    {
        this.nodes.addAll(nodes);
    }

    public void addEdge(Edge<T> edge)
    {
        this.edges.add(edge);
    }

    public void addEdge(Collection<Edge<T>> edges)
    {
        this.edges.addAll(edges);
    }

    public static void main(String [] args)
    {
        Node node1 = new Node("A");
        Node node2 = new Node("B");
        Node node3 = new Node("C");



        Collection <Node<String>> nodes = new ArrayList<Node<String >>();

        ((ArrayList<Node<String>>) nodes).add(node1);
        ((ArrayList<Node<String>>) nodes).add(node2);
        ((ArrayList<Node<String>>) nodes).add(node3);

        Graph <String> graph = new Graph<>(nodes);


    }

}
