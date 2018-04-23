package sort;

/**
 * 定义一个Sort接口，所有的排序方法都要来实现这个接口。
 * 
 * 在测试调用的时候，方便一点啦。
 * 
 * @author martin.wang
 *
 */
public abstract class Sort {
    public abstract void sort(int [] arr);
    
    public void list(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + " -> ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }
}
