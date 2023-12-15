package ex03.test;

public class BubbleTest01 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};

        final int N = arr.length;   //final이 붙은 변수는 대문자로 입력. (자바 문법임)

        //첫번째 도전. 4바퀴 돌기
        for (int i = 0; i < N - 1; i++) {
        //    System.out.println("몇 번 돌지?");
        }

        //두번째 도전. 4바퀴 도는데, 1회전때 4바퀴 도는 내부 for문 만들기
        //두번째 도전. 4바퀴 돌고, 내부적으로 4바퀴 돌기.
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1; j++) {
                System.out.println("몇 바퀴 돌까?");
            }
            System.out.println();
        }

    }

}
