
interface Able {
    void hello(int value);
}
public class Hello {

    static void start(Able able) {

    }

    public static void main(String[] args) {
        start(value -> System.out.println(1));
    }
}
