package p3.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StrRealign {

/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }

        Collections.sort(chars);

        int number = 0;

        for (int i = 0; i < chars.size(); i++) {
            if ((int)chars.get(i) < 65) {
                number += chars.remove(i) - '0';
                i--;
                continue;
            }
            System.out.print(chars.get(i));
        }

        if(number != 0) {
            System.out.println(number);
        }
    }*/

    public static String str;
    public static ArrayList<Character> result = new ArrayList<Character>();
    public static int value = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.next();

        // 문자를 하나씩 확인하며
        for (int i = 0; i < str.length(); i++) {
            // 알파벳인 경우 결과 리스트에 삽입
            if (Character.isLetter(str.charAt(i))) {
                result.add(str.charAt(i));
            }
            // 숫자는 따로 더하기
            else {
                value += str.charAt(i) - '0';
            }
        }

        // 알파벳을 오름차순으로 정렬
        Collections.sort(result);

        // 알파벳을 차례대로 출력
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
        }

        // 숫자가 하나라도 존재하는 경우 가장 뒤에 출력
        if (value != 0) System.out.print(value);
        System.out.println();
    }


}
