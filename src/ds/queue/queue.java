package ds.queue;

public class queue {
	private int maxSize;
	private long[] queueArray;
	private int front;
	private int rear;
	private int nItems;
	
	
	public queue(int size) {
		this.maxSize=size;
		this.queueArray = new long[size];
		this.front=0;
		this.rear=-1;
		this.nItems=0;
	}
	
	public void insert(long j) {
		if(rear== maxSize -1) {
			rear=-1;
		}
		rear++;
		queueArray[rear]=j;
		
		nItems++;
	}
	public long remove() {
		long temp = queueArray[front];
		front++;
		if(front==maxSize)
		{
			front=0;
			
		}
		nItems--;
		return temp;
	}
	
	
	public void view() {
		int i;
		System.out.print("[ ");
		for(i=0;i<queueArray.length;i++) {
			System.out.print(queueArray[i]+ " ");
		}
		System.out.print("]");
	}
}
