package p2.c1.greedy;

import java.util.Scanner;

/*- 어떤 수N이 , 1이 될 때까지 다음의 두 과정 중 하나를 반복적으로 선택하여 수행한다.
        두번째 연산은 N이 K로 나누어 떨어질 때만 선택할 수 있다

        1. N에서 1을 뺀다
        2. N을 K로 나눈다
        - 예를 들어 N이 17, K가 4라고 가정하면, 이 때 1번의 과정을 한 번 수행하면 N은 16이 된다.
          이 후에 2번의 과정을 두 번 수행하면 N은 1이 된다.
          결과적으로 이 경우 전체 과정을 실행한 횟수는 3이 된다
          이는 N을 1로 만드는 최소 횟수이다.

        - N과 K가 주어질 때 N이 1이 될 때까지
          1번 혹은 2번의 과정을 수행해야 하는 최소 횟수를 구하는프로그램을 작성하라 */
public class UntilOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;

        while(true) {

            int target = (n / k) * k; // k로 나눈 몫을 k로 곱한 수 = k로 나누어지는 수 (/연산은 나머지를 표시하지 않기에)
            count += (n - target); // 나머지가 나옴, 해당 나머지를 1씩 빼는 행위 대신, 한번에 연산의 결과로 넣어버림
            // 나머지를 일일이 1씩 빼기고 count++하기 = 나머지의 값을 count에 더하기가 성립하기 때문
            n = target; // n은 k로 나누어지는 수가 됨

            // N이 K보다 작을 경우 == 더 이상 나눌 수 없는 경우 -> 반복문 탈출
            if(n < k) {
                break;
            }
            n /= k; // n을 k로 나눈 값으로 업데이트
            count ++; // 나누기 연산의 횟수를 증가
        }

        // 남은 수에 대해 1씩 뺀 연산 횟수를 더해주기
        count += (n - 1);

        System.out.println(count);
    }
}
