package ex03;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int number = sc.nextInt();

        if (number < 60 && number >= 20) {

        }
        count++;

        int x = number, y = 60;
        if (x > y) {
            int max = x;
        } else if (x < y) {
            int min = y;
        }

        System.out.println((x > y) ? x : y);

    }
}
