package ex06.example7;

public class ShrimpBurger extends Burger {
    private String material; //재료

    public String getMaterial() {
        return material;
    }

    public ShrimpBurger(String name, int price, String material) {
        super(name, price);
        this.material = material;
    }
}
