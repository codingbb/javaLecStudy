package coffee;

public class CoffeeApp {
    public static void main(String[] args) {
        //커피를 new할 수는 없음. new 권한이 main에 없어서 (질럿-게이트웨이)
        Barista barista = new Barista();
        Customer customer = new Customer(barista);

        customer.order("아메리카노");
    }
}
