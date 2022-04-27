package p5.sorting;

public class SelectionSort {

    static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 5, 2, 6, 9, 7};

        for (int i = 0; i < arr.length ; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }
            swap(arr, i, minIdx);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
