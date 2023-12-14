package ex03;

public class Sum {
    public static void main(String[] args) {
        //1부터 10까지의 정수를 더하는 프로그램
        // 1+2+3+4+5+...

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = sum + i;

            System.out.println("1부터 10까지의 정수의 합 =" +sum);
        }
    }
}
