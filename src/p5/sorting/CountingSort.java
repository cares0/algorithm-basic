package p5.sorting;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 6, 9, 5, 2, 4, 5};
        int maxValue = 0;

        // 배열의 요소 중 최댓값 구하기
        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        // 최댓값 + 1만큼의 크기를 가지는 배열 만들기
        int[] cnt = new int[maxValue + 1];

        // arr의 값을 인덱스로 가지는 cnt배열의 요소에 +1
        for (int i = 0; i < arr.length; i++) {
            cnt[arr[i]] ++;
        }

        for (int i = 0; i < cnt.length; i++) {
            for (int j = 0; j < cnt[i]; j++) {
                System.out.println(i);
            }
        }
    }
}
