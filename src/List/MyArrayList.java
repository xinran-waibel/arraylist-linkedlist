package List;

/**
* @author  Xinran (Duan) Waibel
* @version 1.0
* @since   04/01/2015
*/

public class MyArrayList implements MyList {
	
	public Object[] myArrayList;
	public int length;
	public int ptr;
	
	public MyArrayList(int n){
		this.myArrayList=new Object[n];
		this.ptr=0;
		this.length=n;
	}
	
	public MyArrayList(){
		this.myArrayList=new Object[2];
		this.ptr=0;
		this.length=2;
	}

	@Override
	public boolean add(Object o) {
		this.setptr();
		if(this.ptr<this.length){
			this.myArrayList[this.ptr]=o;
			this.ptr++;
			return true;
		}
		else{
			Object[] temp=this.myArrayList;
			this.myArrayList=new Object[this.length*2];
			for(int i=0; i<this.length;i++){
				this.myArrayList[i]=temp[i];
			}
			this.length=this.length*2;
			this.myArrayList[this.ptr]=o;
			this.ptr++;
			return true;
		}
	}

	@Override
	public boolean insert(int index, Object o) {
		this.add(o);
		int swap=this.ptr-1;
		Object tempo;
		while (swap>index){
			tempo = this.myArrayList[swap];
            this.myArrayList[swap] = this.myArrayList[swap-1];
            this.myArrayList[swap-1] = tempo;
            swap--;
		}
		return true;
	}

	@Override
	public void clear() {
		this.myArrayList=new Object[length];
		this.ptr=0;
	}

	@Override
	public boolean contains(Object o) {
		boolean found=false;
		for(int i=0;i<this.myArrayList.length;i++){
			if (this.myArrayList[i].equals(o)){
				found=true;
			}
		}
		return found;
	}

	@Override
	public Object get(int index) {
		if(index<this.ptr){
		return this.myArrayList[index];
		}
		else{
			return null;
		}
	}

	@Override
	public int indexOf(Object o) {
		if(!this.contains(o)){
			return -1;
		}
		else{
		int n=0;
		while(n<length){
			if (this.myArrayList[n].equals(o)){
				return n;
			}
			else{
				n++;
			}
		}
		return -1;
		}
	}

	@Override
	public boolean isEmpty() {
		for(int i=0; i<this.length;i++){
			if(this.myArrayList[i]!=null){
				return false;
			}
		}
		return true;
	}

	@Override
	public Object remove(int index) {
		if(index<this.length){
		Object temp=this.myArrayList[index];
		this.myArrayList[index]=null;
		if (index==this.ptr-1){
			this.ptr--;
		}
		return temp;
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
		this.myArrayList[index]=o;
		}
	}

	@Override
	public int size() {
		int n=0;
		for(int i=0; i<this.length;i++){
			if(this.myArrayList[i]!=null){
				n++;
			}
		}
		return n;
	}

	public void setptr(){
		int update=this.length-1;
		while(update>=0&&this.myArrayList[update]==null){
			update--;
		}
		this.ptr=update+1;
	}
}
