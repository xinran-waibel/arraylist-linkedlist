package List;

import static org.junit.Assert.*;
import org.junit.Test;

/**
* @author  Xinran (Duan) Waibel
* @version 1.0
* @since   04/01/2015
*/

public class MyNodeListTest {

	@Test
	public void addTest() {
		MyNodeList nl1=new MyNodeList();
		nl1.add("first");
		nl1.add("second");
		nl1.add("third");
		System.out.println("nl1 is");
		Node now=nl1.head;
		for(int i=0; i<nl1.length;i++){
			System.out.println(now.getNext().getData());
			now=now.getNext();
		}
		System.out.println();
	}
	
	@Test
	public void insertTest() {
		MyNodeList nl2=new MyNodeList();
		nl2.add("first");
		nl2.add("second");
		nl2.add("third");
		nl2.insert(1, "stone");
		System.out.println("After insert stone in index 1, nl2 is");
		Node now=nl2.head;
		for(int i=0; i<nl2.length;i++){
			System.out.println(now.getNext().getData());
			now=now.getNext();
		}
		System.out.println();
	}
	
	@Test
	public void clearTest() {
		MyNodeList nl3=new MyNodeList();
		nl3.add("first");
		nl3.add("second");
		nl3.add("third");
		nl3.clear();
		System.out.println("nl3 after clear");
		Node now=nl3.head;
		for(int i=0; i<nl3.length;i++){
			System.out.println(now.getNext().getData());
			now=now.getNext();
		}
		System.out.println();
	}
	
	@Test
	public void containsTest() {
		MyNodeList nl4=new MyNodeList();
		nl4.add("first");
		nl4.add("second");
		nl4.add("third");
		System.out.println("if nl4 contains third "+nl4.contains("third"));
		System.out.println("if nl4 contains stone "+nl4.contains("stone"));
		System.out.println();
	}
	
	@Test
	public void getTest() {
		MyNodeList nl5=new MyNodeList();
		nl5.add("first");
		nl5.add("second");
		nl5.add("third");
		System.out.println("element in index 0 in nl5 is "+nl5.get(0));
		System.out.println("element in index 1 in nl5 is "+nl5.get(1));
		System.out.println("element in index 2 in nl5 is "+nl5.get(2));
		System.out.println("element in index 3 in nl5 is "+nl5.get(3));
		System.out.println();
	}
	
	@Test
	public void indexOfTest() {
		MyNodeList nl6=new MyNodeList();
		nl6.add("first");
		nl6.add("second");
		nl6.add("third");
		System.out.println("index of first in nl6 is "+nl6.indexOf("first"));
		System.out.println("index of second in nl6 is "+nl6.indexOf("second"));
		System.out.println("index of third in nl6 is "+nl6.indexOf("third"));
		System.out.println("index of stone in nl6 is "+nl6.indexOf("stone"));
		System.out.println();
	}
	
	@Test
	public void isEmptyTest() {
		MyNodeList nl7=new MyNodeList();
		nl7.add("first");
		nl7.add("second");
		nl7.add("third");
		System.out.println("if nl7 is empty "+nl7.isEmpty());
		nl7.clear();
		System.out.println("if nl7 is empty after clear "+nl7.isEmpty());
		System.out.println();
	}
	
	@Test
	public void removeIndexTest() {
		MyNodeList nl8=new MyNodeList();
		nl8.add("first");
		nl8.add("second");
		nl8.add("third");
		System.out.println("the element removed from index 2 is "+nl8.remove(2));
		System.out.println("after element in index 2 is removed, nl8 is");
		Node now=nl8.head;
		for(int i=0; i<nl8.length;i++){
			System.out.println(now.getNext().getData());
			now=now.getNext();
		}
		System.out.println();
	}

	@Test
	public void removeObjTest() {
		MyNodeList nl9=new MyNodeList();
		nl9.add("first");
		nl9.add("second");
		nl9.add("third");
		System.out.println("if can remove stone from nl9 "+nl9.remove("stone"));
		System.out.println("if can remove first from nl9 "+nl9.remove("third"));
		System.out.println("after first is removed, nl9 is");
		Node now=nl9.head;
		for(int i=0; i<nl9.length;i++){
			System.out.println(now.getNext().getData());
			now=now.getNext();
		}
		System.out.println();
	}
	
	@Test
	public void setTest() {
		MyNodeList nl10=new MyNodeList();
		nl10.add("first");
		nl10.add("second");
		nl10.add("third");
		nl10.set(0, "stone");
		nl10.set(1, "stone");
		System.out.println("After set stone in index 0 and 1, nl10 is");
		Node now=nl10.head;
		for(int i=0; i<nl10.length;i++){
			System.out.println(now.getNext().getData());
			now=now.getNext();
		}
		System.out.println();
	}
	
	@Test
	public void sizeTest() {
		MyNodeList nl11=new MyNodeList();
		nl11.add("first");
		nl11.add("second");
		nl11.add("third");
		System.out.println("size of nl11 is "+nl11.size());
		nl11.add("stone");
		System.out.println("after stone is add, size of nl11 is "+nl11.size());
		nl11.remove("second");
		System.out.println("after second is removed, size of nl11 is "+nl11.size());
		System.out.println();
	}
}
