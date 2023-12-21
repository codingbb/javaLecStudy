//package ex05;
//
//class Pizza {
//    int radius;
//    String name;
//
//    //생성자
//    Pizza(int r, String name) {
//        this.radius = r;
//        this.name = name;
//    }
//
//    //메소드
//    Pizza01 whosLargest(Pizza01 p1, Pizza01 p2) {
//        if (p1.radius > p2.radius) {
//            return p1;
//        } else {
//            return p2;
//        }
//    }
//}
//
//public class PizzaTest {
//    public static void main(String[] args) {
//        Pizza01 obj1 = new Pizza01(14, "슈프림");
//        Pizza01 obj2 = new Pizza01(18, "불고기");
//
//        Pizza01 largest = obj1.whosLargest(obj1, obj2);
//        System.out.println(largest.radius + "인치 피자가 더 큼 " + largest.name + " 피자가 좋음");
//    }
//}
