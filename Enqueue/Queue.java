package ex.bridgelabzs;

public class Queue {
	int front,rear,capacity;
	int queue[];
	
	Queue(int size){
		front=rear=0;
		capacity=size;
		queue=new int[capacity];
	}
	void enqueue(int item) {
		if(capacity==rear) {
			System.out.println("\nQueue is full\n");
			return;
		}else {
			queue[rear]=item;
			rear++;
		}
		return;
	}
	void display() {
		if(front==rear) {
			System.out.println("Queue is empty");
			return;
		}
		for(int i=front; i<rear; i++) {
			System.out.println(queue[i]);
		}
		return;
	}
	void queueFront() {
		if(front==rear) {
			System.out.println("Queue is Empty\n");
			return;
		}
		System.out.println("\nFront element of the queue is:" +queue[front]);
		return;
	}
	public static void main(String[] args) {
		Queue q=new Queue(3);
		System.out.println("Initial Queue");
		//it will be empty
		q.display();
		//insert the elements
		q.enqueue(56);
		q.enqueue(30);
		q.enqueue(70);
		System.out.println("Queue after enqueue operation");
		q.display();
		q.queueFront();
	}
}
