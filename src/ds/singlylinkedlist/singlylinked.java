package ds.singlylinkedlist;

public class singlylinked {

	public static void main(String[] args) {
		singlylinkedlist mylist = new singlylinkedlist();
		mylist.InsertFirst(100);
		mylist.InsertFirst(200);
		mylist.InsertFirst(300);
		mylist.InsertFirst(400);
		mylist.Insertlast(1000);
		mylist.Deletelast();
		
		mylist.Display();

	}

}
