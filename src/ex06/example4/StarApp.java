package ex06.example4;

public class StarApp {

    //객체를 매개변수로 받음
    public static void gameStart(Protoss u1, Protoss u2) {
        u1.attack();
        u2.attack();
    }

    public static void main(String[] args) {
        Protoss z1 = new Zealot("z1");   //Zealot, Protoss
        Protoss d1 = new Dragoon("d1"); //Dragoon, Protoss
        Protoss r1 = new River("r1");     //River, Protoss
        Protoss dark1 = new Dark("dark1"); //Dark, Protoss

        gameStart(z1, d1);
        gameStart(dark1, d1);
    }
}
