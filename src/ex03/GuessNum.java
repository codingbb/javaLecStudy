package ex03;

import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        //1. 문구 출력
        //2. 사용자한테 답을 입력받음
        //3. 컴퓨터가 숫자를 임의로 뽑음 (1~100까지 한정)
        //4. 둘이 맞춰봄.
        //5. 입력받은 수가 낮으면 더 높다고 알려주고, 높으면 낮다고 알려주기
        //6. 정수를 맞출때까지 끝나지 않는 프로그램
        //7. 몇 번만에 맞췄는지 출력해주자.

        Scanner sc = new Scanner(System.in);

        int answer;
        int guess = (int) (Math.random() * 100) + 1;
        int count = 1;
//        int start = 0;

        while (true) {
            System.out.print("정수를 추측하여 보시오: ");

            answer = sc.nextInt();

            if (answer == guess) {
                System.out.println("정답입니다.");
            //    start = 1;
                break;
            } else if (answer > guess) {
                System.out.println("더 낮은 수를 입력하세요.");
            } else if (answer < guess) {
                System.out.println("더 높은 수를 입력하세요.");
            }

            count++;
        }
        System.out.println("시도횟수 = " + count);
    }
}
