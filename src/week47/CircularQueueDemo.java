package week47;

public class CircularQueueDemo<E> {
	private int head, tail, queueSize;
	private E[] circularQueue;
	CircularQueueDemo(int size) {
		circularQueue = (E[]) new Object[size];
		head = -1;
		tail = -1;
		queueSize = 0;
	}
	
	private void enqueue(E item) throws Exception{
		if(isQueueNotEmpty()) {
			throw new Exception("Queue is Full, Hence insertion cannot be done");
		}
		tail = (tail+1)%circularQueue.length;
		circularQueue[tail] = item;
		queueSize ++;
		if(head == -1) {
			head ++;
		}
	}
	
	private boolean isQueueNotEmpty(){
		if(queueSize ==circularQueue.length) {
			return true;
		}
		return false;
	}
	
	private E dequeue() throws Exception {
		if(isQueueEmpty()) {
			throw new Exception("Queue is Empty, Hence deletion cannot be done");
		}
		E element = circularQueue[head];
		circularQueue[head] = null;
		head = (head+1)%circularQueue.length;
		queueSize --;
		return element;
	}
	
	private boolean isQueueEmpty() throws Exception{
		if(queueSize ==0) {
			return true;
		}
		return false;
	}
	
	void show() {
		for (E item:circularQueue) {
			System.out.print(item+" ");
		}
	}
	
	public static void main(String args[]) throws Exception {
		CircularQueueDemo<Integer> circularQueueDemo = new CircularQueueDemo<>(5);
		circularQueueDemo.enqueue(1);
		circularQueueDemo.enqueue(2);
		circularQueueDemo.enqueue(3);
		circularQueueDemo.enqueue(4);
		circularQueueDemo.enqueue(5);
		circularQueueDemo.enqueue(6);
		circularQueueDemo.show();
		circularQueueDemo.dequeue();
		circularQueueDemo.show();
	}
}
