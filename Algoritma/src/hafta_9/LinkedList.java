package hafta_9;

public class LinkedList {
	private Node start;
	private int size;
	
	public LinkedList() {
		this.start=null;
		this.size=0;
	}
	
	public boolean isEmpty() {
		return this.start==null;
	}
	
	public int getSize() {
		return size;
	}
	
	public void insert(int value) {
		Node tmp,nptr,ptr;
		nptr=new Node(value,null);
		boolean flag=false;
		if(start == null) {
			start=nptr;
		}
		else if(start.getData()>nptr.getData()) {
			nptr.setLink(start);
			start=nptr;
		}
		else {
			tmp=start;
			ptr=tmp.getLink();
			while(ptr!=null) {
			     if(value>tmp.getData() && value<ptr.getData()) {
				     tmp.setLink(nptr);
				     nptr.setLink(ptr);
				     flag=true;
				     break;
			      }
			     else {
			    	 tmp=ptr;
			    	 ptr=ptr.getLink();
			     }
			}
			if(flag==false) {
				tmp.setLink(nptr);
			}	
		}
		size++;
	}
	
	

}
