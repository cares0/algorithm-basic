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

/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N과 K를 입력받기
        int n = sc.nextInt();
        int k = sc.nextInt();

        // 배열 A의 모든 원소를 입력받기
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // 배열 B의 모든 원소를 입력받기
        Integer[] b = new Integer[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        // 배열 A는 오름차순 정렬 수행
        Arrays.sort(a);
        // 배열 B는 내림차순 정렬 수행
        Arrays.sort(b, Collections.reverseOrder());

        // 첫 번째 인덱스부터 확인하며, 두 배열의 원소를 최대 K번 비교
        for (int i = 0; i < k; i++) {
            // A의 원소가 B의 원소보다 작은 경우
            if (a[i] < b[i]) {
                // 두 원소를 교체
                int temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
            // A의 원소가 B의 원소보다 크거나 같을 때, 반복문을 탈출
            else break;
        }

        // 배열 A의 모든 원소의 합을 출력
        long result = 0;
        for (int i = 0; i < n; i++) {
            result += a[i];
        }
        System.out.println(result);
    }
*/

}
