package coffee;

public class Customer {

    private Barista barista;

    public Customer(Barista barista) {
        this.barista = barista;
    }

    public void order(String menuName) {                //메뉴이름을 매개변수로 받고, 해당하는 이름이 있으면 주는
        Coffee coffee = barista.makeCoffee();           //오더는 바리스타랑 협력(오브젝트-오브젝트) 함.
        System.out.println(coffee.name+"을 받았습니다.");
    }
}
