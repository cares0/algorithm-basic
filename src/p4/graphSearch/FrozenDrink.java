package p4.graphSearch;

import java.util.Scanner;

public class FrozenDrink {

    static int n, m;

    static int[][] graph;

    static boolean dfs(int x, int y) {
        // 상하좌우로 이동할 수 없는 경우(2차원 배열의 범위를 벗어남)는 진행안함
        if (x < 0 || x >= n || y < 0 || y >= m) {
            return false;
        }
        // 값이 0이면 탐색되지 않았다고 처리함
        if (graph[x][y] == 0) {
            graph[x][y] = 1;
            // 탐색처리 하고 해당 노드의 상하좌우를 탐색하기 위해 dfs재귀 호출
            dfs(x - 1, y);
            dfs(x + 1, y);
            dfs(x, y - 1);
            dfs(x, y + 1);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        graph = new int[n][m];

        // 입력된 값 2차원 배열에 넣기
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        // 각각의 노드를 상하좌우 비교
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j)) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
