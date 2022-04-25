package p3.implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class FourDirections {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 공간 크기 (n * n)
        sc.nextLine();
        String[] plans = sc.nextLine().split(" ");
        // 한 줄 전체를 받아오는데, " "를 기준으로 쪼개서 String[]로 만든다.

        int x = 1, y = 1;

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};

        for (int i = 0; i < plans.length; i++) {
            char plan = plans[i].charAt(0);
            int nx = -1, ny = -1;
            for (int j = 0; j < 4; j++) {
                if (plan == moveTypes[j]) {
                    // 총 이동할 값 계산
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            if (nx < 1 || ny < 1 || nx > n || ny > n) {
                continue;
            }
            x = nx;
            y = ny;
        }
        System.out.println(x + " " + y);
    }
}
