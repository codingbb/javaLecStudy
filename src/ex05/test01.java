package ex05;

public class test01 {
    static void inc(int a) {
        a = a + 1;
    }

    public static void main(String[] args) {
        int x = 10;

        test01.inc(x);
        System.out.println(x);

    }
}
