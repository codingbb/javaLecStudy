package ex17;

interface CookAble {
    void cook();
}

interface KnifeAble {
    void kill();
}

class 백종원 implements CookAble {
    //Knife에서 kill몸체를 구현했으니 cook만 구현하면 된다
    @Override
    public void cook() {
        System.out.println("요리하다");
    }
}

class 전사 implements CookAble, KnifeAble {
    @Override
    public void kill() {
        System.out.println("공격");
    }

    @Override
    public void cook() {
        System.out.println("요리");
    }
}

public class Hello {
}
