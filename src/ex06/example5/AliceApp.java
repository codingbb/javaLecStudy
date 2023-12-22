package ex06.example5;

abstract class 판사 {
    public abstract void 심문(); //껍데기만 만들기, 판사를 통로로만 사용
}

abstract class 증인 {
    public abstract void 대답();
}

class 왕 extends 판사 {
    public void 심문() {
        System.out.println("왕은 심문한다");
    }
}

class 왕비 extends 판사 {
    public void 심문() {
        System.out.println("왕비는 심문한다");
    }
}

class 모자장수 extends 증인 {
    public void 대답() {
        System.out.println("모자장수는 대답한다");
    }
}

class 토끼 extends 증인 {
    public void 대답() {
        System.out.println("토끼는 대답한다");
    }
}

class 앨리스 extends 증인 {

    public void 대답() {
        System.out.println("앨리스는 대답한다");
    }
}

public class AliceApp {
    public static void main(String[] args) {
        판사 u1 = new 왕비();   //메모리에 [판사, 왕비]
        증인 u2 = new 토끼();   //메모리에 [증인, 토끼] 뜬다
        증인 u3 = new 앨리스();

        u1.심문();
        u2.대답();
        u3.대답();

    }

}
