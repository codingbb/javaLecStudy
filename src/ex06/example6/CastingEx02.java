package ex06.example6;

class Protoss {

}

class Zealot extends Protoss {
    public void attack() {
        System.out.println("질럿이 공격합니다.");
    }
}

class Dragoon extends Protoss {
    public void attack() {
        System.out.println("드라군이 공격합니다.");
    }
}

public class CastingEx02 {
    public static void start(Protoss p) {
        Dragoon u = (Dragoon) p;
        u.attack();
    }

//public class CastingEx01 {
//    public static void start(Protoss p) {
//        if (p instanceof Zealot) {
//            Zealot u = (Zealot) p;
//            u.attack();
//        }
//
//        if (p instanceof Dragoon) {
//            Dragoon u = (Dragoon) p;
//            u.attack();
//        }
//
//    }

    public static void main(String[] args) {
        Protoss d1 = new Dragoon();
        Dragoon zz = (Dragoon) d1;
//        start(new Zealot());
        start(new Dragoon());

    }
}
