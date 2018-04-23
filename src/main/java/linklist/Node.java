package linklist;

/**
 * 定义链表的节点
 * 
 * 为了简便期间，我们假设链表的数据部分只能放int类型的数据。实际上，这个位置可以存放任意类型的数据。
 * 
 * @author martin.wang
 *
 */
class Node {
    int data;
    Node next;
    
    public Node() {
        
    }
    
    public Node(int data){
        this.data = data;
    }
    
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}