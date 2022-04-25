package p2.greedy;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*    - 한 마을에 모험가가 N명 있다.
        모험가 길드에서는 N명의 모험가를 대상으로 '공포도'를 측정했는데,
        '공포도'가 높은 모험가는 쉽게 공포를 느껴 위험 상황에서 제대로 대처할 능력이 떨어진다
      - 모험가 길드장인 동빈이는 모험가 그룹을 안전하게 구성하고자
        공포도가 X인 모험가는 반드시 X명 이상으로 구성한 모험가 그룹에 참여해야
        여행을 떠날 수 있도록 규정했다
      - 동빈이는 최대 몇 개의 모험가 그룹을 만들 수 있는지 궁금하다.
        N명의 모험가에 대한 정보가 주어졌을때,
        여행을 떠날 수 있는 그룹 수의 최댓값을 구하는 프로그램을 작성하라
      - 예를 들어 N = 5이고, 각 모험가의 공포도가 [2 3 1 2 2] 같다고 가정한다
        이 경우 그룹 1에 공포도가 1, 2, 3인 모험가를 한 명씩 넣고,
        그룹 2에 공포도가 2인 남은 두명을 넣게되면 총 2개의 그룹을 만들 수 있다
      - 또한 몇 명의 모험가는 마을에 그대로 남아 있어도 되기 때문에,
        모든 모험가를 특정한 그룹에 넣을 필요는 없다 */
public class Guild {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> fears = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            fears.add(sc.nextInt());
        }
        Collections.sort(fears);

        int group = 0;
        int count = 0;
        for (int i = 0; i < fears.size(); i++) {
            group++;
            if (fears.get(i) <= group) {
                group = 0;
                count ++;
            }
        }
        System.out.println(count);
    }
}
