package ex06.example3;

import ex06.example4.Dark;
import ex06.example4.River;

public class StarApp {

    //객체를 매개변수로 받음
    public static void gameStart(Zealot u1, Dragoon u2) {
        u1.attack();
        u2.attack();
    }

    public static void main(String[] args) {
        Zealot z1 = new Zealot("z1");
        Dragoon d1 = new Dragoon("d1");
        River r1 = new River("r1");
        Dark dark1 = new Dark("dark1");


        gameStart(z1, d1);
//        gameStart(d1, z1);
//        gameStart(z2, z1);
//        gameStart(z1, z2);
    }
}
