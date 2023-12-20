package ex04;

class Cat {
    String name;

    Cat() { //기본 생성자
        //this.name = "토비"; //이렇게 초기화를 많이 함
        this("토비"); //11번 라인의 파라미터가 있는 생성자를 호출함 //이건 잘 안씀
    }

    Cat(String name) {  //파라미터가 있는 생성자
        this.name = name;

        }
    }

public class HeapEx01 {
    public static void main(String[] args) {
        Cat c = new Cat();   //기본 생성자를 호출함
        System.out.println(c.name);
    }
}
