package sort;

import org.junit.Test;

public class InsertionSortTest {
    @Test
    public void test() {
        int [] arr = {1, 4, 6, 9, 7, 2, 3, 5, 8, 10};
        Sort sortor = new InsertionSort();
        sortor.sort(arr);
        sortor.list(arr);
    }
}
