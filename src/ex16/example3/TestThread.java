package ex16.example3;

//class MyRunnable2 implements Runnable {
//    String myName;
//
//    public MyRunnable2(String name) {
//        myName = name;
//    }
//
//    public void run() {
//        for (int i = 0; i <= 10; i++) {
//            System.out.print(myName + i + " ");
//
//        }
//    }
//    }

public class TestThread {
    public static void main(String[] args) {
        String myName = "A";
//        MyRunnable2 my2 = new MyRunnable2("A");
//        MyRunnable2 my4 = new MyRunnable2("B");
//
//        new Thread(my2).start();
//
        new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                System.out.print(myName + i + " ");
            }
        }).start();
        System.out.println("abc");
        System.out.println("def");
        System.out.println("fdfjsdkhfjdhffd");


        }

        }
