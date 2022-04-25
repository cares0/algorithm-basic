package p3.implementation;

import java.util.Scanner;

public class TimeIncludingThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int count = 0;

        // 59분 59초 사이에 3이 들어가는 경우 계산
        for (int i = 0; i < 60; i++) {
            for (int j = 0; j < 60; j++) {
                String time = "" + i + j;
                if (time.indexOf("3") != -1) {
                    count++;
                }
            }
        }

        int result = 0;
        // 주어진 n을 비교해서 3이 들어간 경우는 모든 경우를 추가해줌
        // 아니라면, 위에서 구한 count값을 추가해줌
        for (int i = 0; i <= Integer.parseInt(n); i++) {
            if (String.valueOf(i).indexOf("3") != -1) {
                result = result + 60 * 60;
            } else {
                result = result + count;
            }
        }
        System.out.println(count);
        System.out.println(result);
    }
}
// 교재 풀이
/*    // 특정한 시각 안에 '3'이 포함되어 있는지의 여부
    public static boolean check(int h, int m, int s) {
        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // H를 입력받기
        int h = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i <= h; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    if (check(i, j, k)) cnt++;
                    // 매 시각 안에 '3'이 포함되어 있다면 카운트 증가

                }
            }
        }
        System.out.println(cnt);
    }
}*/
