package binarytree;

/**
 * 定义一个二叉树的节点
 * 
 * @author martin.wang
 *
 */
public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;
    
    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
