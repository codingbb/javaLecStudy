package ex03;

import java.util.Scanner;

public class GugudanEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 구구단을 입력하세요.");

        int userSelect = sc.nextInt();

        for (int i = userSelect; i <= userSelect; i++) {
            System.out.println(i + "단 시작!!!");

            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}

