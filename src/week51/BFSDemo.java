package week51;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class BFSDemo {
	private int V;
	private LinkedList<Integer> adj[];
	
	BFSDemo(int v) {
		this.V = v;
		adj = new LinkedList[V];
		for (int i=0; i<v;i++) {
			adj[i] = new LinkedList<>();
		}
	}
	void add(int v, int w) {
		adj[v].add(w);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		BFSDemo bfsDemo = new BFSDemo(n);
		for (int i=0;i<n;i++) {
			String str = br.readLine();
			String[] str1 = str.split(" ");
			bfsDemo.add(i,Integer.parseInt(str1[1]));
		}
	}
}
