package p1.complexity;

// 시간 복잡도 계산 - N개의 데이터 합 계산 프로그램(반복문)
public class Loop {

    public static void main(String[] args) {

        int[] n = {3, 5, 1, 2, 4}; // 5개의 데이터(N=5)
        int summary = 0; // 합계를 저장할 변수

        for(int i : n) {
            summary += i;
        }

        System.out.println(summary);
    }
}
