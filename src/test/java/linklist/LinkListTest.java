package linklist;

import org.junit.Test;

import junit.framework.TestCase;
import linklist.LinkList;

public class LinkListTest {
    @Test
    public void testAddNode() {
        LinkList list = new LinkList();
        list.insertNode(3);
        list.insertNode(2);
        list.insertNode(1);
        list.insertNode(5);
        list.insertNode(4);
        list.listNodes();
        TestCase.assertEquals(5, list.length());
        
        System.out.println("--------------------------");
        
        list.insertNode(22, 100);
        list.insertNode(0, 200);
        list.listNodes();
    }
    
    
}
