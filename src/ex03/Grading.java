package ex03;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        // 90이상이면 A학점, 80이상 ~ 90미만이면 B학점, 70이상 ~ 80미만이면 C학점
        // 60점 미만이면 F학점

        Scanner sc = new Scanner(System.in);

        System.out.println("학점을 입력하세요.");
        int score = sc.nextInt();
        
        if (score >= 90) {
            System.out.println("A학점");
        } else if (score >= 80) {
            System.out.println("B학점");
        } else if (score >= 70) {
            System.out.println("C학점");
        } else if (score >= 60) {
            System.out.println("D학점");
        } else {
            System.out.println("F학점");
        }
        
    }
}
