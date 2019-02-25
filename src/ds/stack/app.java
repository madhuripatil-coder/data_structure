package ds.stack;

public class app {

	public static void main(String[] args) {
		stack  mystack = new stack(3);
		mystack.push(20);
		mystack.push(60);
		mystack.push(90);
		mystack.push(40);

	
	while(!mystack.isempty()) {
		long value = mystack.pop();
		System.out.println(value);
	}
	}
}
