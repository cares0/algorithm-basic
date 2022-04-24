package p2.c1.greedy;

/*  당신은 음식점의 계산을 도와주는 점원입니다.
    거스름돈으로 사용할 500원, 100원, 50원, 10원짜리 동전이 무한히 존재한다고 가정합니다.
    손님에게 거슬러 주어야 할 돈이 N원일 때 거슬러 주어야 할 동전의 최소 개수를 구하세요.
    (단, 거슬러 줘야 할 돈 N은 항상 10의 배수입니다.) */
public class Balance {

    public static void main(String[] args) {
        int[] coins = {500, 100, 50, 10};
        int count = 0;
        int balance = 1260;

        for(int i=0; i<coins.length; i++) {
            count = balance / coins[i];
            // count += balance / coins[i]; 총 거스름 횟수를 구할 경우
            balance = balance % coins[i];
            System.out.println(coins[i] + "원 : " + count);
        }
    }
}
