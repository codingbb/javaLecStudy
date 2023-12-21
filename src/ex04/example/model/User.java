package ex04.example.model;

public class User {
    final int id; //고객 중 동일한 이름이 있다면? 고유번호로 비교하는게 더 빠르다! (프라이머리키)   //계좌번호는 변경될 리가 없으니 final
    String name;    //String name = "홍길동";이라고 하면 홍길동이라는 고객만 만들 수 있음
    String email;   //부식별자 (유일값). 식별자는 보통 2개정도 만든다

    public User(int id, String name, String email) {    //초기화 해야하니까 생성자 필요! (alt + insert)
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
