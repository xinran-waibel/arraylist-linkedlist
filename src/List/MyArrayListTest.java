package List;

import static org.junit.Assert.*;
import org.junit.Test;

/**
* @author  Xinran (Duan) Waibel
* @version 1.0
* @since   04/01/2015
*/

public class MyArrayListTest {

	@Test
	public void addTest() {
		MyArrayList al1=new MyArrayList(3);//constructor
		MyArrayList al2=new MyArrayList();//default constructor
		
		al1.add("first");
		al1.add("second");
		al1.add("third");
		al2.add("first");
		al2.add("second");
		
		System.out.println("al1 after construct:");
		for(int i=0;i<al1.myArrayList.length;i++){
			if (al1.myArrayList[i]!=null){
			System.out.println(al1.myArrayList[i]);
			}
		}
		System.out.println();
		System.out.println("al2 after construct:");
		for(int i=0;i<al2.myArrayList.length;i++){
			if (al2.myArrayList[i]!=null){
			System.out.println(al2.myArrayList[i]);
			}
		}
		
		System.out.println();
		System.out.println("Now al1 and al2 are full");
		al1.add("fourth");
		al2.add("third");
		System.out.println("al1 after add new element:");
		for(int i=0;i<al1.myArrayList.length;i++){
			if (al1.myArrayList[i]!=null){
			System.out.println(al1.myArrayList[i]);
			}
		}
		System.out.println("Length of al1 now is "+al1.length+" which is doubled");
		System.out.println();
		System.out.println("al2 after add new element:");
		for(int i=0;i<al2.myArrayList.length;i++){
			if (al2.myArrayList[i]!=null){
			System.out.println(al2.myArrayList[i]);
			}
		}
		System.out.println("Length of al2 now is "+al2.length+" which is doubled");
		System.out.println();
}
	@Test
	public void insertTest() {
		MyArrayList al3=new MyArrayList(3);//constructor		
		al3.add("first");
		al3.add("second");
		al3.add("third");
		System.out.println("al3 after insert stone in index 0");
		al3.insert(0, "stone");
		for(int i=0;i<al3.myArrayList.length;i++){
			if (al3.myArrayList[i]!=null){
			System.out.println(al3.myArrayList[i]);
			}
		}
		System.out.println();
		System.out.println("al3 after insert stone in index 4");
		al3.insert(4, "stone");
		for(int i=0;i<al3.myArrayList.length;i++){
			if (al3.myArrayList[i]!=null){
			System.out.println(al3.myArrayList[i]);
			}
		}
		System.out.println();
	}
	
	@Test
	public void clearTest() {
		MyArrayList al4=new MyArrayList(3);//constructor		
		al4.add("first");
		al4.add("second");
		al4.add("third");
		System.out.println("al4 after clear");
		al4.clear();
		for(int i=0;i<al4.myArrayList.length;i++){
			if (al4.myArrayList[i]!=null){
			System.out.println(al4.myArrayList[i]);
			}
		}
		System.out.println();
	}
	
	@Test
	public void containsTest() {
		MyArrayList al5=new MyArrayList(3);//constructor		
		al5.add("first");
		al5.add("second");
		al5.add("third");
		
		System.out.println("if al5 contains first "+al5.contains("first"));
		System.out.println("if al5 contains fifth "+al5.contains("fifth"));
		System.out.println();
	}
	
	@Test
	public void getTest() {
		MyArrayList al6=new MyArrayList(3);//constructor		
		al6.add("first");
		al6.add("second");
		al6.add("third");
		
		System.out.println("element in index 0 of al6 contains first "+al6.get(0));
		System.out.println("element in index 4 of al6 contains fifth "+al6.get(4));
		System.out.println();
	}
	
	@Test
	public void indexOfTest() {
		MyArrayList al7=new MyArrayList(3);//constructor		
		al7.add("first");
		al7.add("second");
		al7.add("third");
		
		System.out.println("index of second in al7 contains first "+al7.indexOf("second"));
		System.out.println("index of fifth in al7 contains fifth "+al7.indexOf("fifth"));
		System.out.println();
	}
	
	@Test
	public void isEmptyTest() {
		MyArrayList al8=new MyArrayList(3);//constructor		
		al8.add("first");
		al8.add("second");
		al8.add("third");
		
		System.out.println("if al8 is empty "+al8.isEmpty());
		al8.clear();
		System.out.println("if al8 is empty after clear "+al8.isEmpty());
		System.out.println();
	}
	
	@Test
	public void removeIndexTest() {
		MyArrayList al9=new MyArrayList(3);//constructor		
		al9.add("first");
		al9.add("second");
		al9.add("third");
		
		System.out.println("The object removed from al9 in index 4 is "+al9.remove(4)+" because it doesn't have that many elements");
		System.out.println("The object removed from al9 in index 1 is "+al9.remove(1));
		System.out.println("al9 after remove");
		for(int i=0;i<al9.myArrayList.length;i++){
			if (al9.myArrayList[i]!=null){
			System.out.println(al9.myArrayList[i]);
			}
		}
		System.out.println();
		
	}
	
	@Test
	public void removeObjTest() {
		MyArrayList al10=new MyArrayList(3);//constructor		
		al10.add("first");
		al10.add("second");
		al10.add("third");
		
		System.out.println("if we can remove fifth from al10 "+al10.remove("fifth")+" because it is not in al10");
		System.out.println("if we can remove third from al10 "+al10.remove("third"));
		System.out.println("al10 after remove");
		for(int i=0;i<al10.myArrayList.length;i++){
			if (al10.myArrayList[i]!=null){
			System.out.println(al10.myArrayList[i]);
			}
		}
		System.out.println();
	}
	
	@Test
	public void setTest() {
		MyArrayList al11=new MyArrayList(3);//constructor		
		al11.add("first");
		al11.add("second");
		al11.add("third");
		
		System.out.println("al11 after set stone in index 0");
		al11.set(0,"stone");
		for(int i=0;i<al11.myArrayList.length;i++){
			if (al11.myArrayList[i]!=null){
			System.out.println(al11.myArrayList[i]);
			}
		}
		System.out.println();
	}
	
	@Test
	public void sizeTest() {
		MyArrayList al12=new MyArrayList(3);//constructor		
		al12.add("first");
		al12.add("second");
		al12.add("third");
		System.out.println("size of al12 is "+al12.size());
		al12.remove(0);
		System.out.println("size of al12 after remove element in 0 is "+al12.size());
		System.out.println();
	}
}
