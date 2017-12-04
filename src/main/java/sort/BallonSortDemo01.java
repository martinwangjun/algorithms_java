package sort;

/**
 * 冒泡法排序
 * 
 * 
 * @author martin.wang
 *
 */
public class BallonSortDemo01 {
    public static void main(String[] args) {
        int [] arr = {4, 5, 2, 1, 9, 0, 7, 3, 6, 5, 8};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int a: arr) {
            System.out.print(a + " ");
        }
    }
}
