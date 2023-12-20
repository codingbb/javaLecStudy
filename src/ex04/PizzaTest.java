package ex04;

    public class PizzaTest {
        public static void main(String[] args) {
            Pizza obj1 = new Pizza();
            System.out.println("(" + obj1.type+ " , " + obj1.size + ",)");

            Pizza obj2 = new Pizza(24, "포테이토");
            System.out.println("(" + obj2.type + " , " + obj2.size + ",)");
        }

    }




