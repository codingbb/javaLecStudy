package ex06.example7;

//컴포지션 사용
public class BurgerSet {    //has 관계. Burger와 Coke를 가짐
    private Burger burger;
    private Coke coke;      //필요한 애들을 상태로 가짐. //생성자로 초기화 할거라 빈값

    public BurgerSet(Burger burger, Coke coke) {
        this.burger = burger;
        this.coke = coke;
        System.out.println("버거 세트가 만들어졌어요.");
    }

    public int getTotalPrice() {
        return burger.getPrice() + coke.getPrice();
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }
}
