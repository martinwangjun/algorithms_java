package sort;

public class QuickSort implements Sort {

    @Override
    public void sort(int[] arr) {
        
    }

    @Override
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
