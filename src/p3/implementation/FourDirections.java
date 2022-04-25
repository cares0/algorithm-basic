package p3.implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class FourDirections {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 공간 크기 (n * n)
        sc.nextLine();
        String[] plan = sc.nextLine().split(" "); 
        // 한 줄 전체를 받아오는데, " "를 기준으로 쪼개서 String[]로 만든다.

        int x = 1;
        int y = 1;

        for (int i = 0; i < plan.length; i++) {
            switch (plan[i]) {
                case "U":
                    if (x <= 1) {
                        continue;
                    }
                    x --;
                    break;
                case "D":
                    if (x >= n) {
                        continue;
                    }
                    x ++;
                    break;
                case "L":
                    if (y <= 1) {
                        continue;
                    }
                    y --;
                    break;
                default:
                    if (y >= n) {
                        continue;
                    }
                    y ++;
            }
        }
        System.out.println(x + " " + y);
    }
}
