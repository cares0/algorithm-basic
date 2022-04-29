package p7.dynamicProgramming;

public class FibonacciNumbers {

    // 피보나치 함수(Fibonacci Function)을 재귀함수로 구현
    static int fibo(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }
        return fibo(x - 1) + fibo(x - 2);
    }

    // 보텀업 방식으로 피보나치 구현
    static long[] d = new long[100];
    static long fiboBottomUp(int n) {
        d[1] = 1;
        d[2] = 1;
        for (int i = 3; i <= n; i++) {
            d[i] = d[i - 1] + d[i - 2];
        }
        return d[n];
    }
    public static void main(String[] args) {
        System.out.println(fibo(50)); // 엄청 오래걸림
        System.out.println(fiboBottomUp(50)); // 바로 결과가 나옴
    }
}
