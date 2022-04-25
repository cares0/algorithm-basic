package p3.implementation;

import java.util.Scanner;

public class Knight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String position = sc.nextLine();
        int x = position.charAt(1) - '1';
        int y = position.charAt(0) - 'a';

        // 상하좌우
        int[] mx = {-2, +2, 0, 0};
        int[] my = {0, 0, -2, +2};

        int count = 0;

        for (int i = 0; i < 4; i++) { // 상하좌우로 우선 2칸 이동했을 경우

            // 범위를 벗어나면 증감식으로 돌아감 (밑 코드 실행X)
            if (x + mx[i] < 0 || y + my[i] < 0 || x + mx[i] > 7 || y + my[i] > 7) {
                continue;
            }

            for (int j = -1; j < 2; j += 2) {
                if(i / 2 == 0) { // 상하로 이동했을 경우 -> y축에 -1, +1 해봄
                    if (y + j < 0 || y + j > 7) { // 범위를 벗어날 경우 증감식으로
                        System.out.println(x + "," + y);
                        continue;
                    }
                } else { // 좌우로 이동했을 경우 -> x축에 -1, +1 해봄
                    if (x + j < 0 || x + j > 7) { // 범위를 벗어날 경우 증감식으로
                        System.out.println(x + "," + y);
                        continue;
                    }
                }
                count++;
            }
        }
        System.out.println(count);
    }
}
