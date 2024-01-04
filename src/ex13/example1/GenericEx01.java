package ex13.example1;

class Box<T> {
    T data;
}

public class GenericEx01 {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>();
        Box<Integer> b2 = new Box<>();
        Box<Double> b3 = new Box<>();

        b1.data = "스트";
        b2.data = 55;
        b3.data = 56.7665;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

    }
}
