package ex03;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n;
       long fact = 1;

       System.out.println("정수를 입력하세요.");
       n = sc.nextInt();

       for (int i = 1; i <= n; i++) {
           fact = fact * i;
       }

        System.out.println(n + "!의 팩토리얼은 " + fact + "입니다.");

    }
}
