package ex02;

public class CastEx01 {
    public static void main(String[] args) {
        int n1 = 1;
        double d1 = 1.5;

        n1 = 2;

        d1 = n1; //업캐스팅 //8칸짜리에 4칸짜리를 넣음
        System.out.println(d1);

        n1 = (int) d1;  //다운캐스팅 //강제형변환
        System.out.println(n1);

    }

}
