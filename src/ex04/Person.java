package ex04;

public class Person {

    int age = 10;

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 20;
        System.out.println(p1.age);

        Person p2 = new Person();
        System.out.println(p2.age);

        Person p3 = p1;
        p3.age = 50;
        System.out.println(p3.age);
    }
}
