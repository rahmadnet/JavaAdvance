package queue;

public class Myqueue {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.push(9);
		queue.push(-5);
		queue.push(11);
		queue.push(13);
		queue.push(7);
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		
		
	}
}
