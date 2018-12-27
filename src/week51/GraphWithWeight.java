package week51;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GraphWithWeight {
	static class Edge{
		int src;
		int dest;
		int weight;
		Edge(int src, int dest, int weight) {
			this.src = src;
			this.dest = dest;
			this.weight = weight;
		}
	}
	static class Node{
		int value;
		int weight;
		Node(int value, int weight) {
			this.value = value;
			this.weight = weight;
		}
	}
	List<List<Node>> adj = new ArrayList<>();
	GraphWithWeight(List<Edge> edges) {
		int n = edges.size();
		for (int i=0;i<n;i++) {
			adj.add(i, new ArrayList<>());
		}
		for (Edge edge: edges) {
			adj.get(edge.src).add(new Node(edge.dest, edge.weight));
		}
	}
	static void printGraph(GraphWithWeight graphWithWeight) {
		int s =0;
		int n = graphWithWeight.adj.size();
		while (s<n) {
			for (Node node: graphWithWeight.adj.get(s)) {
				System.out.print("("+s+"-->"+node.value+") ("+node.weight+")\t");
			}
			System.out.println("");
			s++;
		}
	}
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Edge> edges = new ArrayList<>();
		for (int i=0;i<n;i++) {
			String str = br.readLine();
			String[] str1 = str.split(" ");
			if(str1.length ==3) {
				Edge edge = new Edge(Integer.parseInt(str1[0]),Integer.parseInt(str1[1]),
					Integer.parseInt(str1[2]));
				edges.add(edge);
			}
		}
		GraphWithWeight graphWithWeight = new GraphWithWeight(edges);
		printGraph(graphWithWeight);
		br.close();
	}
}
