package linklist;

import org.junit.Test;
import junit.framework.TestCase;
import linklist.LinkList;

public class LinkListTest {
    // @Test
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
    
    // 测试获取Node
    // @Test
    public void testGetNode() {
        LinkList list = new LinkList();
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(5);
        
        // 5 -> 4 -> 3 -> 2 -> 1
        TestCase.assertEquals(5, list.getNode(0).data);
        TestCase.assertEquals(1, list.getNode(4).data);
        TestCase.assertNull(list.getNode(6));
    }
    
    @Test
    public void testGetNodeByValue() {
        LinkList list = new LinkList();
        list.insertNode(10);
        list.insertNode(20);
        list.insertNode(30);
        list.insertNode(40);
        list.insertNode(50);
        
        // 50 -> 40 -> 30 -> 20 -> 10
        TestCase.assertEquals(0, list.getNodeByValue(50));
        TestCase.assertEquals(2, list.getNodeByValue(30));
        TestCase.assertEquals(-1, list.getNodeByValue(100));
    }
    
}
