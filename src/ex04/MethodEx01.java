package ex04;

public class MethodEx01 {

    static void m1() {
        System.out.println("m1");
    }

    static String m2() {
        System.out.println("m2");
        return "m2";    //메서드 종료
    }

    public static void main(String[] args) {
        m1();   //여기에서는 m2클래스가 메모리에 열리지 않는다. (실행하지 않으면 JVM입장에서는 5번라인 외엔 아무것도 안보임)
        m2();   //호출이 되는 순간, m2클래스(10번과 11번)가 열린다. (실행이 되어야지 안의 내용이 열림)
                //실행이 끝나면 리턴값으로 바뀐다. m2()가 "m2"로 바뀐다!
                //즉, String result = m2(); 랑 같다는 말!


    }
}
