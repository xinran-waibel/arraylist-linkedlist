package List;

/**
* @author  Xinran (Duan) Waibel
* @version 1.0
* @since   04/01/2015
*/

public class Node {

	// instance variables
    private Object data;
    private Node next;

    // constructors
    public Node() {

    }

    public Node(Object o, Node link) {
         data = o;
         next = link;
    }

    // selectors
    public Object getData() {
         return data;
    }

    public void setData(Object o) {
         data = o;
    }

    public Node getNext() {
         return next;
    }

    public void setNext(Node link) {
         next = link;
    }
}
