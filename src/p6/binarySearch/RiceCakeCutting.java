package p6.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class RiceCakeCutting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 떡의 갯수
        int m = sc.nextInt(); // 떡의 길이

        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        int start = 0;
        int end = (int) 1e9;
        int result = 0;

        while (start <= end) {
            long total = 0;
            int mid = (start + end) / 2;
            for (int i = 0; i < n; i++) {
                if(ar[i] > mid) {
                    total += ar[i] - mid;
                }
            }
            if (total < m) {
                end = mid - 1;
            } else {
                result = mid;
                start = mid + 1;
            }
        }

        System.out.println("result = " + result);
    }
}
