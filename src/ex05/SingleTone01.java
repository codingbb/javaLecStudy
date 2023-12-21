package ex05;

class President {

    //static이 있으니까 main실행 전에 뜸. instance(참조 변수)
    static President instance = new President();

    public President() {

    }
}

public class SingleTone01 {
    public static void main(String[] args) {
        President p1 = President.instance;  //이렇게 객체를 가져옴. instance를 통해서 5번 라인에 접근
        System.out.println(p1.hashCode());  //hash임의의 난수

        President p2 = President.instance;  //이렇게 객체를 가져옴. instance를 통해서 5번 라인에 접근
        System.out.println(p2.hashCode());

    }
}
