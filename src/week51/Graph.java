package week51;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Graph {
	static class Edge{
		int source;
		int destination;
		Edge(int source, int destination) {
			this.source = source;
			this.destination = destination;
		}
	}
	List<List<Integer>> adj = new ArrayList<>();
	public Graph(List<Edge> edges) {
		for(int i=0;i<edges.size();i++) {
			adj.add(i,new ArrayList<>());
		}
		for (Edge edge:edges) {
			adj.get(edge.source).add(edge.destination);
			adj.get(edge.destination).add(edge.source);
		}
	}
	public static void printGraph(Graph graph) {
		int src = 0;
		int n = graph.adj.size();
		while (src<n) {
			for (int dist: graph.adj.get(src)) {
				System.out.print("("+src+"->"+dist+")\t");
			}
			System.out.println();
			src++;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Edge> edgeList = new ArrayList<>();
		for(int i=0;i<n;i++) {
			String str = br.readLine();
			String[] str1 = str.split(" ");
			Edge edge = new Edge(Integer.parseInt(str1[0]), Integer.parseInt(str1[1]));
			edgeList.add(edge);
		}
		Graph graph = new Graph(edgeList);
		printGraph(graph);
		br.close();
	}
}
