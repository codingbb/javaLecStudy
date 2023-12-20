package ex04;

//설계도
class People {
    String name;    //애의 스코프는 heap
    int power;
    int hp;

    //객체 초기화할때 사용
    public People(String name, int power) { //애의 name은 스코프가 stack //값을 전달받아서 객체의 상태값으로 옮김.
        this.name = name;   //this는 스코프가 heap에 있는 애를 이야기함
        this.power = power;
        this.hp = 100;  //생성할 때마다 hp는 100으로 고정이니 애는 상수로 받는다.
    }

    //초기값이 아니라, 살아가면서 느는거라(?) 메소드 (행위)
    public void upgradePower() {
        this.power++;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", hp=" + hp +
                '}';
    }
}

public class PersonEx01 {

    public static void main(String[] args) {
        People p1 = new People("티모", 10);
        System.out.println(p1);

        p1.upgradePower();
        System.out.println(p1);

    }
}
