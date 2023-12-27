package ex06.example7;

class Person2 {
    int age;
    char gender;

    public Person2() {

    }
    public Person2(int age, char gender) {
        this.age = age;
        this.gender = gender;
    }
}

public class test01 {
    public static void main(String[] args) {
        Person2 p = new Person2();
        Person2 p1 = new Person2();
        Person2 p2 = new Person2(1, '남');

        System.out.println(p.hashCode());
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
