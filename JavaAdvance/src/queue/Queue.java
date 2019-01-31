package queue;


public class Queue {
	private int [] object;
	private int front;
	private int rear;
	private int queueSize;
	
	
	public Queue() {
		front = -1;
		rear = -1;
		queueSize = 10;
		object = new int [queueSize];
	}
	
	public void push(int data) {
		if((front + 1) >= queueSize)
			resize();
		object[++front] = data;
	}
	
	public Integer pop() {
		if(front > rear)
			return object[++rear];
		return null;
	}
	
	public boolean isEmpty() {
		return front == rear;
		
	}
	public void resize() {
		int [] temp = object;
		queueSize = queueSize * 2;
		object = new int[queueSize];
		
		for(int i = 0; i <= front;i++)
			object[i] = temp[i];
	}
}
