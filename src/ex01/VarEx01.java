package ex01;

public class VarEx01 {
    public static void main(String[] args) {
        int n1 = 1;  //21억까지 (4Byte)
        double d1 = 1.5; //21억까지. 21억.2, 21억.542 이런 식으로 쓸 수 있음.
        // double은 8byte. 램 8칸 사용
        long big1 = 20000000000L; //경까지 저장 가능. (8byte) long을 쓸 때는 L을 꼭 사용!
        boolean b1 = true; //true, false //1bit이런건 있을 수가 없어! 못찾아! 1Byte 사용
        char c1 = '가'; //char는 쌍따옴표 안씀. 홀따옴표. '한글자'를 사용.
        String s1 = "가나다"; //String은 앞에 꼭 대문자로 넣어주기. //문자열을 저장

        System.out.println(n1);
        System.out.println(d1);
        System.out.println(big1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(s1);
    }
}
