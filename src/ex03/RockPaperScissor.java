package ex03;

import java.util.Scanner;

public class RockPaperScissor {
    final int SCISSOR = 0;
    final int ROCK = 1;
    final int PAPER = 2;

    public static void main(String[] args) {
        //1. 가위바위보 시작
        //2. 컴퓨터가 임의의 숫자를 생성한다.
        //3. 사용자가 숫자를 고른다/ 가위 -1, 바위 -2, 보 -3
        //4. 두개를 비교해본다.
        //5. 누가 이겼는지 출력한다.

        Scanner sc = new Scanner(System.in);

        System.out.println("가위바위보 시작!");
        System.out.println("가위 - 1, 바위 - 2, 보 - 3");
        int user = sc.nextInt();

        int computer = (int)(Math.random() * 3);
        if (user == computer) {
            System.out.println("비겼습니다.");
        } else if (user == (computer + 1) % 3) {
            System.out.println("인간 : " + user + "  컴퓨터 : " + computer + "   인간 승리");
        } else {
            System.out.println("인간 : " + user + "  컴퓨터 : " + computer + "   컴퓨터 승리");
        }

    }
}
