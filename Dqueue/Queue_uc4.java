package ex.bridgelabzs;

public class Queue_uc4 {
	int front,rear,capacity;
	int queue[];
	
	Queue_uc4(int size){
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
	void dqueue() {
		if(front==rear) {
			System.out.println("\nQueue is empty");
			return;
		}else {
			for(int i=0; i<rear-1; i++) {
				queue[i]=queue[i+1];
			}
		
			if(rear<capacity) {
				queue[rear]=0;
				rear--;
			}
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
		Queue_uc4 q=new Queue_uc4(3);
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
		//delete the 1 element
		System.out.println("\nQueue after dqueue operation");
		q.dqueue();
		q.display();
		q.queueFront();
	}
}
