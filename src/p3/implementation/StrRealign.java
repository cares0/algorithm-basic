package p3.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StrRealign {

    public static void main(String[] args) {
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
    }

}
