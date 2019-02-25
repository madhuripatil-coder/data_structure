package ds.stack;

public class stack {
 private int maxsize;
private long[] stackArray;
private int top;


public  stack(int size){
  this.maxsize = size;
  this.stackArray = new long[maxsize];
  this.top = -1;
  
}
public  void push(long j) {
	
	//maxsize=top;
 
	top++;
	if (top>=maxsize) {
		System.out.println("stack overflow");
	}
	else 
	{
	stackArray[top]=j;
	}
}

public long pop() {
	top--;
	if(top <= -1) 
	{
		System.out.println("stack underflow");
		return -1;
	}
	else 
	{
	int old_top=top;
	return stackArray[old_top];
	}
}
public long peak(){
	
	return stackArray[top];
}

public boolean isempty() {
	return top ==-1;
}

public boolean isfull() {
	return maxsize-1==top;
}


}