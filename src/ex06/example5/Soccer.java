package ex06.example5;

class Sports {
    String getName() {
        return "아직 결정되지 않음";
    }
    int getPlayer() {
        return 0;
    }
}

public class Soccer extends Sports {
    private String name = "축구";
    private int member;

    public Soccer(int member) {
        this.member = member;
    }
    String getName() {
        return name;
    }
    int getPlayer() {
        return member;
    }

    public static void main(String[] args) {
        Sports sp = new Soccer(11);
        System.out.println("경기이름 : " + sp.getName() + " 경기자수 " + sp.getPlayer());
    }
}
