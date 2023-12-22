package ex06.example2;

class Animal {
    void speak() {
        System.out.println("멍멍");
    }

    void run() {
        System.out.println("달린다");
    }

}

class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("야옹");

    }
}


public class AnimalEx01 {
    public static void main(String[] args) {
        Animal c1 = new Cat(); // [Cat, Animal] 같이 뜬다.
        c1.speak();
        c1.run();
    }
}
