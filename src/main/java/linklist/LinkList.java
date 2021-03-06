package linklist;

import org.apache.log4j.Logger;

public class LinkList {
    public Node head; // 定义头结点
    private final Logger LOGGER = Logger.getLogger(LinkList.class);
    
    /**
     * 插入新的节点
     * 
     * 对于链表来说，插入新的节点，可以又头插入和尾插入。这里的实现使用的是头插入方式。
     * 
     * 头插入方式：O(1)
     * 尾插入方式：O(N)
     * 
     * @param d
     */
    public void insertNode(int d) {
        Node temp = new Node(d);
        temp.next = head;
        head = temp;
    }
    
    /**
     * 在指定位置插入Node
     * 
     * 在指定位置插入一个节点
     * 
     * O(N)
     * 
     * @param index
     * @param d
     */
    public void insertNode(int index, int d) {
        if (length() == 0) {
            insertNode(d);
            return;
        }
        if(index < 0 || index > this.length() - 1) {
            LOGGER.info("Index: " + index + " illegal.");
            return;
        }
        Node temp = head;
        int currentPostion = 0;
        while (temp.next != null) {
            if(index == currentPostion) {
                Node node = new Node(d);
                node.next = temp.next;
                temp.next = node;
                return;
            }
            temp = temp.next;
            currentPostion++;
        }
        if(currentPostion == length() - 1) {
            Node node = new Node(d);
            node.next = temp.next;
            temp.next = node;
        }
    }
    
    /**
     * 按照指定的位置，获取Node
     * 
     * @param index
     */
    public Node getNode(int index) {
        int postion = 0;
        Node temp = head;
        while(temp != null) {
            if(index == postion) {
                return temp;
            }
            postion++;
            temp = temp.next;
        }
        return null;
    }
    
    public int getNodeByValue(int value) {
        Node temp = head;
        int position = 0;
        while(temp != null) {
            // 如果不是基本数据类型，则需要使用.equals方法来判断
            if(temp.data == value) {
                return position;
            }
            position++;
            temp = temp.next;
        }
        return -1;
    }
    
    
    /**
     * 删除指定的节点，从0开始算
     */
    public void deleteNode(int index) {
        if(index < 0 || index >= this.length()) {
            LOGGER.info("Index: " + index + " illegal.");
            return;
        }
        if (index == 0) {
            
        }
        
    }
    
    
    
    
    /**
     * 列出所有的节点
     */
    public void listNodes() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    public int length() {
        int len = 0;
        Node temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }
    
    
    
//    // 插入数据
//    public void addNode(int d) {
//        Node newNode = new Node(d);
//        newNode.next = head;
//        head = newNode;
//    }
//
//    public void addNode(Node node) {
//        node.next = head;
//        head = node;
//    }
//    
//    // 删除数据：按index来，index从0开始
//    public boolean deleteNode(int index) {
//        // 如果是不存在的Node
//        if (index < 0 || index > length()) {
//            return false;
//        }
//        // 如果是第一个结点
//        if (index == 0) {
//            head = head.next; // 指向第一个
//            return true;
//        }
//        // 如果不是第一个结点
//        int i = 1;
//        Node preNode = head;
//        Node curNode = preNode.next;
//        while (curNode != null) {
//            if (i == index) {
//                preNode.next = curNode.next;
//                return true;
//            }
//            preNode = curNode;
//            curNode = curNode.next;
//            i++;
//        }
//        return false;
//    }
//
//    // 删除数据：按Node来
//    public boolean deleteNode(Node node) {
//        if(node== null) {
//            return false;
//        }
//        if(node == head) {
//            head = node.next;
//            return true;
//        }
//        Node preNode = head;
//        while(preNode.next != null) {
//            if(preNode.next == node) {
//                preNode.next = node.next;
//                return true;
//            }
//            preNode = preNode.next;
//        }
//        return false;
//    }
//
//    // 获取长度
//    public int length() {
//        int length = 0;
//        Node temp = head;
//        while (temp != null) {
//            length++;
//            temp = temp.next;
//        }
//        return length;
//    }
//
//    // 遍历
//    public void list() {
//        Node pointer = head;
//        while (pointer != null) {
//            System.out.println(pointer.data);
//            pointer = pointer.next;
//        }
//    }
//    
//    // 按Node查找，返回位置，没有找到返回-1
//    public int searchByNode(Node node) {
//        int i = 0;
//        Node temp = head;
//        while(temp.next != null) {
//            if (node.equals(temp)) {
//                break;
//            }
//            i++;
//            temp = temp.next;
//        }
//        if (temp.next == null && !node.equals(temp)) {
//            i = -1;
//        }
//        return i;
//    }
//    
//    /**
//     * 反转一个链表
//     * 
//     * @param node
//     * @return
//     */
//    public Node reverse(Node node) {
//        Node prev;
//        if(node == null || node.next == null) {
//            prev = node;
//        } else {
//            Node temp = reverse(node.next);
//            node.next.next = node;
//            node.next = null;
//            prev = temp;
//        }
//        return prev;
//    }
//    
//    @Override
//    public String toString() {
//        StringBuilder sBuilder = new StringBuilder("");
//        Node temp = head;
//        while (temp != null) {
//            sBuilder.append(
//                    "{ NodeHashCode: " + temp.hashCode() + 
//                    ", NodeData: " + temp.data + 
//                    ", NodeNext: " + (temp.next==null?"NULL":temp.next.hashCode()) + 
//                    " }\n");
//            temp = temp.next;
//        }
//        return sBuilder.toString();
//    }

}
