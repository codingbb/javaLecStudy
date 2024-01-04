package ex16;

public class ThreadEx01 {

    public static void sub1() {
        for (int i = 1; i < 6; i++) {
            try {
                System.out.println("Start1 thread : " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void sub2() {
        for (int i = 1; i < 6; i++) {
            try {
                System.out.println("Start2 thread : " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //main thread는 run메소드만 호출함 (러너블에 있는 void run())
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            sub1(); //타겟
        });
        t1.start(); //운영체제가 run메소드를 때려줌. 콜백.
                    //운영체제한테 start를 요청했는데 애가 run메소드를 때려줌

        //실을 만드는 것 - 메인스레드가 실 만듬
        Thread t2 = new Thread(() -> {
            sub2(); //타겟 (run 메소드)
        });
        t2.start(); //실을 시작하는 것

        //메인 스레드 종료 (가장 먼저 종료) - sub1, sub2 모두 새로운 스레드가 실행하는거니
        //단, 자바는 스레드가 하나라도 살아있으면 종료 안됨!


    }
}
