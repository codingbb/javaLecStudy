package ex06.example5;

class Circle {
    public String pizzaName;
    protected int radius;

    public Circle(int r) {
        radius = r;
    }
}

public class Pizza extends Circle {
    public Pizza(String pizzaName, int radius) {
        super(radius);
        this.radius = radius;
        this.pizzaName = pizzaName;
    }

    public void print() {
        System.out.println("피자의 종류 : " + pizzaName + " 피자의 크기 : " + radius);
    }

    public static void main(String[] args) {
        Pizza obj = new Pizza("Pepperoni", 20);
        obj.print();
    }
}
