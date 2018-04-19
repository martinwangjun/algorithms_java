package sort;

/**
 * 定义一个Sort接口，所有的排序方法都要来实现这个接口。
 * 
 * 在测试调用的时候，方便一点啦。
 * 
 * @author martin.wang
 *
 */
public interface Sort {
    void sort(int [] arr);
    void list(int [] arr);
}
