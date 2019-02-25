package ds.singlylinkedlist;

public class singlylinkedlist {
	private node first;
	private node last;
	public singlylinkedlist() {
		
	}
	
	private boolean isEmpty() 
	{
		return (first == null);
	}
	public void InsertFirst(int data) {
		node newnode = new node();
		newnode.data = data;
		newnode.next=first;
		first = newnode;
		
	}
  public node Deletefirst() {
	 node temp = first;
	 first.next=first;
	 return  temp;
  }
  public void Display() {
	  System.out.println("list ");
	 node current = first;
	 while(current!=null) {
		 current.displaynode();
		 current = current.next;
	 }
	 System.out.println("");
  }
  
  public void Insertlast(int data) {
	  node current = first;
	  while(current.next!=null) {
		  current = current.next;
		  }
	  node newnode =new node();
	  newnode.data= data;
	  current.next=newnode;
	  last=newnode;
	  
  }

public node Deletelast() {
	node current = first;
	while(current.next!= last ) {
		current = current.next;
	}
	System.out.println("2nd last item");
	System.out.println(current.data);
	current.next = null;
	last = current;
	return last;
}  
  
}
