package sort;

public class BubbleSort implements Sort{
    
    @Override
    public void sort(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
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
