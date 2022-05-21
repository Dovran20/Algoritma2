package hafta_9;

public class Node {
	
	private int data;
	private Node next;
	
	public Node(int data,Node next) {
		this.data=data;
		this.next=next;
	}
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
	
	public void setLink(Node next) {
		this.next=next;
	}
	
	public void setData(int data) {
		this.data=data;
	}

	public int getData() {
		return this.data;
	}
	
	public Node getLink() {
		return this.next;
	}
}
