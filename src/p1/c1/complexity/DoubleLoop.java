package p1.c1.complexity;

// 시간 복잡도 계산 - 2중 반복문의 경우
public class DoubleLoop {

    public static void main(String[] args) {
        int[] array = {3, 5, 1, 2, 4}; // 5개의 데이터(N=5)
        int temp = 0;

        for(int i : array) {
            for(int j : array) {
                temp = i * j;
                System.out.println(temp);
            }
        }
    }
}
