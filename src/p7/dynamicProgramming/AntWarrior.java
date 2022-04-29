package p7.dynamicProgramming;

import java.util.Scanner;

public class AntWarrior {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        int[] dp = new int[n];
        dp[0] = ar[0];
        dp[1] = Math.max(ar[0], ar[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + ar[i]);
        }

        System.out.println(dp[n - 1]);
    }
}
