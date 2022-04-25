package p2.greedy;

import java.util.Scanner;

/*    - 각 자리가 숫자(0부터 9)로만 이루어진 문자열 S가 주어졌을 때
        왼쪽부터 오른쪽으로 하나씩 모든 숫자를 확인하며 숫자 사이에 'x' 혹은 '+' 연산자를 넣어
        결과적으로 만들어질 수 있는 가장 큰 수를 구하는 프로그램을 작성하라
        단, +보다 x를 먼저 계산하는 일반적인 방식과는 달리 모든 연산은 왼쪽에서부터 순서대로 이루어진다고 가정한다

      - 예를 들어 02984라는 문자열로 만들 수 있는 가장 큰 수는 ((((0 + 2) × 9) × 8) × 4) = 576 이다
        또한 만들어질 수 있는 가장 큰 수는 항상 20억 이하의 정수가 되도록 입력이 주어진다 */

public class AddOrMultiply {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String numbers = sc.nextLine();
        int result = numbers.charAt(0) - '0';
        // 0에 해당하는 아스키코드 값을 빼서도 int형으로 변환 가능

        for(int i=0; i<numbers.length() - 1; i++) {
            int number = numbers.charAt(i+1) - '0';
            if(result <= 1 || result <= 1) {
                result += number;
            } else {
                result *= number;
            }
        }
        System.out.println(result);
    }
}
