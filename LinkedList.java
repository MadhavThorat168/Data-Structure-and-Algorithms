package LinkedList;

public class LinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		public Node(int data) {
		this.data=data;
		next=null;
		}
	}
	public LinkedList() {
		this.head=null;
	}
	public void AddFirst(int data) {
		Node nn=new Node (data);
		if(head==null) {
			head=nn;
		}else {
			nn.next=head;
			head=nn;
		}
	}
	public void Display() {
		if(head==null)
			System.out.println("LinkedList is Empty");
		else {
			Node trev;
			trev =head;
			while(trev!=null) {
				System.out.print("---> "+trev.data);
				trev=trev.next;
		     }
			
			}
		}
	public void AddLast(int data) {
		Node nn=new Node(data);
		if(head==null)
			head=nn;
		else {
			Node trev=head;
			while(trev.next!=null) 
				trev =trev.next;
			trev.next=nn;
		}
	}
	public void AddAtPosition(int pos,int data) {
		
		Node nn= new Node(data);
		
		if(head ==null) 
			nn=head;
		
	else if(pos<1) {
		nn.next=head;
		head=nn;
	}
	else {
		Node trev = head;
		for(int i=1; i < pos-1 && trev.next !=null ; i++) {
			trev=trev.next;
			
		}
		nn.next=trev.next;
		trev.next=nn;
	}
 }
	public void DelFirst() {
		if(head==null) {
			System.out.println("LinkedList is Empty");
		}
		else
			head=head.next;     // head contains the address of first node and Head.next contains address of second so here we can do 
		                        // that head is pointing directly to second instead of first so first is Remove 
			
		}
	public void DelLast() {
		if(head==null)
			System.out.println("LInkedList is Empty");
		else if(head.next==null)
			head=null;
		else {
			Node trev=head;
			while(trev.next.next!=null) {
				trev=trev.next;
			}
			trev.next=null;
		}
	}
	
	
	}
		
	

