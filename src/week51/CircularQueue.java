package week51;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircularQueue<E> {
	int head,tail,queueSize;
	E[] circularQueue;
	CircularQueue(int size){
		head = -1;
		tail = -1;
		queueSize = 0;
		circularQueue = (E[]) new Object[size];
	}
	void enqueue(E item) throws Exception{
		if(isNotQueueNotEmpty()) {
			throw new Exception("Queue is full, hence item can not be inserted");
		}
		tail = (tail+1)%circularQueue.length;
		circularQueue[tail] = item;
		queueSize++;
		if(head == -1) {
			head++;
		}
	}
	E dequeue() throws Exception {
		if(isQueueEmpty()) {
			throw new Exception("Queue is Empty, Hence you cannot dequeue");
		}
		E item = circularQueue[head];
		circularQueue[head] =null;
		head = (head+1)%circularQueue.length;
		queueSize --;
		return item;
	}
	boolean isNotQueueNotEmpty() {
		if(queueSize ==circularQueue.length) {
			return  true;
		}
		return  false;
	}
	boolean isQueueEmpty() {
		if(queueSize ==0) {
			return true;
		}
		return false;
	}
	void print() {
		for (int i=0;i<circularQueue.length;i++) {
			System.out.print(circularQueue[i]+" ");
		}
	}
	public static void main(String args[]) throws IOException,Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		CircularQueue<Integer> circularQueue = new CircularQueue<>(n);
		for (int i=0;i<n;i++) {
			Integer item = Integer.parseInt(br.readLine());
			circularQueue.enqueue(item);
		}
		circularQueue.dequeue();
		circularQueue.print();
		br.close();
	}
}
