package List;

/**
* @author  Xinran (Duan) Waibel
* @version 1.0
* @since   04/01/2015
*/

public class MyNodeList implements MyList {

	public Node head;
	public int length;
	public Node ptr;
	
	public MyNodeList(){
		this.length=0;
		head=new Node(null,null);
		this.ptr=head;
	}
	
	@Override
	public boolean add(Object o) {
		Node temp=this.head;
		while(temp.getNext()!=null){
			temp=temp.getNext();
		}
		this.ptr=temp;
		Node newNode=new Node(o,null);
	    this.ptr.setNext(newNode);
	    this.ptr=newNode;
	    this.length++;
	    return true;
	}

	@Override
	public boolean insert(int index, Object o) {
		if(index<this.length){
		Node next;
		Node last=this.head;
		while(index>0){
			last=last.getNext();
			index--;
		}
		next=last.getNext();
		Node newNode=new Node(o,next);
		last.setNext(newNode);
		this.length++;
		return true;
		}
		else{
			return false;
		}
	}

	@Override
	public void clear() {
		this.head.setNext(null);
		this.length=0;
		this.ptr=head;
	}

	@Override
	public boolean contains(Object o) {
		int n=this.length;
		Node now=head;
		while(n>0){
			if(now.getNext().getData().equals(o)){
				return true;
			}
			now=now.getNext();
			n--;
		}
		return false;
	}

	@Override
	public Object get(int index) {
		if(index<this.length){
		Node now=this.head;
		while(index>=0){
			now=now.getNext();
			index--;
		}
		return now.getData();
		}
		else{
			return null;
		}
	}

	@Override
	public int indexOf(Object o) {
		int index=0;
		Node now=head;
		while(index<this.length){
			if(now.getNext().getData().equals(o)){
				return index;
			}
			else{
				now=now.getNext();
				index++;
			}
		}
		return -1;
	}

	@Override
	public boolean isEmpty() {
		return this.length==0;
	}

	@Override
	public Object remove(int index) {
		if(index<this.length){
			if(index==this.length-1){
				Node last2=this.head;
				while(index>0){
					last2=last2.getNext();
					index--;
				}
				Object temp2=last2.getNext().getData();
				last2.setNext(null);
				this.ptr=last2;
				length--;
				return temp2;
			}
			else{
			Node next;
			Node last=this.head;
			while(index>0){
				last=last.getNext();
				index--;
			}
			next=last.getNext();
			Object temp=next.getData();
			next=next.getNext();
			last.setNext(next);
			this.length--;
			return temp;
			}
			}
			else{
				return null;
			}
	}

	@Override
	public boolean remove(Object o) {
		if(this.contains(o)){
			this.remove(this.indexOf(o));
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public void set(int index, Object o) {
		if(index<this.length){
		Node last=this.head;
		while(index>0){
			last=last.getNext();
			index--;
		}
		last.getNext().setData(o);
		}
	}

	@Override
	public int size() {
		return this.length;
	}
	
	public void setptr(){
		Node temp=this.head;
		while(temp.getNext()!=null){
			temp=temp.getNext();
		}
		this.ptr=temp;
	}

}
