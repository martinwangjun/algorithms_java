package sort;

import org.junit.Test;

public class SelectionSortTest {
    @Test
    public void test() {
        int [] arr = {1, 4, 6, 9, 7, 2, 3, 5, 8, 0};
        SelectionSort sortor = new SelectionSort();
        sortor.sort(arr);
        sortor.list(arr);
    }
}
