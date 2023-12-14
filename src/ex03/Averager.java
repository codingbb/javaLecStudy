package ex03;

import java.util.Scanner;

public class Averager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int count = 0;

        while (true) {
            System.out.print("점수를 입력하세요 : ");
            int grade = sc.nextInt();

            if (grade < 0) {
                break;
            }

            total = total + grade;
            count++;

        }

        System.out.println("평균 점수는 " + total / count);

    }
}
