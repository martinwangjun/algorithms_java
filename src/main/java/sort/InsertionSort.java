package sort;

public class InsertionSort implements Sort{
    
    @Override
    public void sort(int [] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                int temp = arr[i];
                int j = i;
                while (j > 0 && arr[j - 1] > temp) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }
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
