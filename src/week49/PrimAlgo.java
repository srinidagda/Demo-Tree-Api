package week49;

import java.util.Arrays;

public class PrimAlgo {
	static class Graph{
		int vertices;
		int matrix[][];
		
		public Graph(int vertices) {
			this.vertices = vertices;
			matrix = new int[vertices][vertices];
		}
		public void addEdge(int source, int desination, int weight) {
			matrix[source][desination] = weight;
			
			matrix[desination][source] = weight;
		}
		
		class ResultSet{
			// will store the vertex(parent) from which the current vertex will reached
			int parent;
			//will store the weight for printing the MST weight
			int weight;
		}
		
		public int getMinimumVertex(boolean[] mst, int[] key) {
			int minKey = Integer.MAX_VALUE;
			int vertex = -1;
			for (int i=0; i< vertices;i++) {
				if(mst[i]==false&&minKey>=key[i]) {
					minKey = key[i];
					vertex = i;
				}
			}
			return vertex;
		}
		
		public void primMST() {
			boolean[] mst = new boolean[vertices];
			ResultSet[] resultSet = new ResultSet[vertices];
			int[] key = new int[vertices];
			
			//Initializes all the keys to infinity and
			//Initialize resultSet for all the vertices
			for (int i=0; i< vertices; i++) {
				key[i] = Integer.MAX_VALUE;
				resultSet[i] = new ResultSet();
			}
			//Start from the vertex
			key[0] = 0;
			resultSet[0] = new ResultSet();
			resultSet[0].parent = -1;
			
			//create MST
			for(int i=0; i<vertices;i++) {
				//Get the vertex with the minimum key
				int vertex = getMinimumVertex(mst,key);
				//include this vertex in the mst
				mst[vertex] = true;
				
				//Iterate through all the adjacent of above vertex and update the keys
				for (int j=0; j<vertices;j++) {
					//check of the edge
					if (matrix[vertex][j] >0) {
						//check if this vertex 'j' already in the mst and
						//if no then check if key needs an update or not
						if(mst[j]==false && matrix[vertex][j]<key[j]) {
							//update the key
							key[j] = matrix[vertex][j];
							//update the result set
							resultSet[j].parent = vertex;
							resultSet[j].weight = key[j];
						}
					}
				}
			}
			//print mst
			printMst(resultSet);
		}
		public void printMst(ResultSet[] resultSet) {
			int total_min_weight = 0;
			System.out.println("Minimum Spanning Tree: ");
			for (int i=1; i<vertices-1;i++) {
				System.out.println("Edge: "+i+" - "+resultSet[i].parent+
				" key: " + resultSet[i].weight);
				total_min_weight += resultSet[i].weight;
			}
			System.out.println("Total minimum weight " + total_min_weight);
		}
	}
	public static void main(String args[]) {
		int vertices = 7;
		Graph graph = new Graph(vertices);
		graph.addEdge(0, 1, 4);
		graph.addEdge(0, 2, 3);
		graph.addEdge(1, 2, 1);
		graph.addEdge(1, 3, 2);
		graph.addEdge(2, 3, 4);
		graph.addEdge(3, 4, 2);
		graph.addEdge(4, 5, 6);
		//graph.addEdge(4, 5, 6);
		graph.primMST();
	}
}
