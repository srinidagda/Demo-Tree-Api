package week51;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
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
			//Uncomment the below line for Bidirected graph
			//adj.get(edge.destination).add(edge.source);
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
	public static void bfs(Graph graph, int s, int n) {
		boolean[] visited = new boolean[n];
		LinkedList<Integer> queue = new LinkedList<>();
		visited[s] = true;
		queue.add(s);
		while (queue.size() != 0) {
			s = queue.poll();
			System.out.print(s+" ");
			Iterator<Integer> i = graph.adj.get(s).listIterator();
			while (i.hasNext()) {
				int next = i.next();
				if(!visited[next]) {
					visited[next] = true;
					queue.add(next);
				}
			}
		}
	}
	public static void DFSUtil(int s, Graph graph,boolean[] visited) {
		visited[s] = true;
		System.out.print(s+" ");
		Iterator<Integer> iterator = graph.adj.get(s).listIterator();
		while (iterator.hasNext()) {
			int next = iterator.next();
			if(!visited[next]) {
				visited[next] = true;
				DFSUtil(next,graph,visited);
			}
		}
	}
	public static void DFS(Graph graph, int s, int n) {
		boolean[] visited = new boolean[n];
		DFSUtil(s,graph, visited);
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
		int s = Integer.parseInt(br.readLine());
		bfs(graph,s,n);
		System.out.println("");
		DFS(graph,s,n);
		br.close();
	}
}
