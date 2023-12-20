package ex04;

public class Box1 {
    int width, height, depth;
}

class Box1Test {
    public static void main(String[] args) {
        Box1 b = new Box1();
        System.out.println("상자의 크기 : (" + b.width + "," + b.height + "," + b.depth + ")");
    }
}
