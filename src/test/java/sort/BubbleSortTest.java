package sort;

import org.junit.Test;

public class BubbleSortTest {
    @Test
    public void test() {
        int [] arr = {1, 4, 6, 9, 7, 2, 3, 5, 8, 0};
        Sort sortor = new BubbleSort();
        sortor.sort(arr);
        sortor.list(arr);
    }
}
