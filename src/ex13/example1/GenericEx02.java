package ex13.example1;

class Dog {
    public String name;
    public int age;

    public void speak() {
        System.out.println("멍멍");
    }
}

class Cat {
    public String name;
    public int age;

    public void speak() {
        System.out.println("야옹");
    }
}

public class GenericEx02 {
    public static void main(String[] args) {
        Object[] arr = new Object[2];
        Object d = new Dog();
        arr[0] = new Dog();
        arr[1] = new Cat();

        Dog d1 = (Dog) arr[0];    //[Object, Dog]
        Cat c1 = (Cat) arr[1];    //[Object, Cat]

        d1.speak();
        c1.speak();

    }
}
