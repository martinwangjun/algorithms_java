package linklist;

import org.junit.Test;

import junit.framework.TestCase;
import linklist.MyLinkedList;

public class MyLinkedListTest {
    @Test
    public void testAddNode() {
        MyLinkedList list = new MyLinkedList();
        list.addNode(3);
        list.addNode(2);
        list.addNode(1);
        list.addNode(5);
        list.addNode(4);
        list.printList();
        TestCase.assertEquals(5, list.length());
    }
    
    
}
