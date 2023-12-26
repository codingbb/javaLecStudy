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
//    String getName() {
//
//    }
//    int getPlayer() {
//
//    }

    public static void main(String[] args) {
        Sports sp = new Soccer();
        System.out.println("경기이름 : " + " 경기자수");
    }
}
