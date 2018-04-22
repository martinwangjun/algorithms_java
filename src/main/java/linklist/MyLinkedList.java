package linklist;

/**
 * 链表的实现
 * 
 * @author martin.wang
 * @see http://blog.csdn.net/jianyuerensheng/article/details/51200274
 */
public class MyLinkedList {
    Node head = null;
    
    // 节点
    class Node{
        Node next = null;
        int data;
        public Node(int data) {
            this.data = data;
        }
    }
    
    // 添加节点
    public void addNode(int d) {
        Node newNode = new Node(d);
        if(head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    // 删除节点
    public boolean deleteNode(int index) {
        if(index < 0 || index >= length()) {
            return false;
        }
        if(index == 0) {
            head = head.next;
            return true;
        }
        int i = 1;
        Node previousNode = head;
        Node currentNode = previousNode.next;
        while(currentNode != null) {
            if(i == index) {
                previousNode.next = currentNode.next;
                return true;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
            i++;
        }
        return false;
    }
    
    
    
    
    // 取得长度
    public int length() {
        int len = 0;
        Node temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }
    
    // 打印链表
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("");
    }
}
