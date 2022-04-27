package p5.sorting;

import java.util.Scanner;

public class ChangeElement {

    static void quickSort(int[] ar, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = start;
        int left = start + 1;
        int right = end;

        while (left <= right) {
            while (left <= end && ar[left] <= ar[pivot]) {
                left++;
            }
            while (right > start && ar[right] >= ar[pivot]) {
                right--;
            }
            if (left > right) {
                int temp = ar[pivot];
                ar[pivot] = ar[right];
                ar[right] = temp;
            } else {
                int temp = ar[left];
                ar[left] = ar[right];
                ar[right] = temp;
            }
        }
        quickSort(ar, start, right - 1);
        quickSort(ar, right + 1, end);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a1 = new int[n];
        int[] a2 = new int[n];

        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a2[i] = sc.nextInt();
        }

        quickSort(a1, 0, n - 1);
        quickSort(a2, 0, n - 1);

        for (int i = 0; i < n; i++) {
            if (a1[i] <= a2[n - 1 - i]) {
                a1[i] = a2[n - 1 - i];
                k--;
            }
            if (k == 0) {
                break;
            }
        }

        /*for (int i = 0; i < k; i++) {
            if(a1[i] <= a2[n - 1 - i]) {
                a1[i] = a2[n - 1 - i];
            } else {
                break;
            }
        }*/

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += a1[i];
        }

        System.out.println(result);

    }
}
