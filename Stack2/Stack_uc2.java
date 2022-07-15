package ex.bridgelabzs;

public class Stack_uc2 {
	static final int max=1000;
	int top;
	int a[]=new int[max];
	
	boolean isEmpty() {
		return(top<0);
	}
	Stack_uc2(){
		top=-1;
	}
	boolean push(int x) {
		if(top>=(max-1)) {
			System.out.println("overflow");
			return false;
		}else {
			a[++top]=x;
			System.out.println(x + "pushed into stack");
			return true;
		}
	}
	int pop() {
		if(top<0) {
			System.out.println("underflow");
			return 0;
		}else {
			int x=a[top--];
			return x;
		}
	}
	int peek() {
		if(top<0) {
			System.out.println("underflow");
			return 0;
		}else {
			int x=a[top];
			return x;
		}
	}
	void print() {
		for(int i=top; i>=-1; i--) {
			System.out.println(" "+ a[i]);
		}
	}

	public static void main(String[] args) {
		Stack_uc2 s=new Stack_uc2();
		s.push(70);
		s.push(30);
		s.push(56);
		System.out.println(s.pop() + "popped from stack");
		System.out.println("Top element is:" +s.peek());
		System.out.println("Elements present in the stack:");
		s.print();
	}
 }
