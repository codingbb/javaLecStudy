package ex04.example.model;

public class Account {  //account가 왜 오브젝트냐? 하나 안들고있잔아 여러개를 들고 있잖아
    final int id; //(교육용이라 4자리, int로 만듬) 계좌번호 - 숫자 10자리로 만들어져있다. 계좌번호는 번호지만 int에 99억 담기냐? 안담김! 그래서 문자로 만듬
                    //final이라는 상태값은 반드시 new가되면 초기화가 되어야함. 초기화 코드가 없어서 에러!
    public long balance; //잔액. int로 만들면 21억만 이체 됨. 그래서 long
    int userId; //식별하기 위함. 1이 들어왔다 > ssar 계좌

    public Account(int id, long balance, int userId) {  //생성자를 만드니 final int id 에러가 사라짐. 기본생성자가 같이 있으면 에러!(초기화 안될 수도 있어서)
        this.id = id;
        this.balance = balance;
        this.userId = userId;
    }

    //객체 내ㅔ부의 값을 볼때 toString을 만들면 편함

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", userId=" + userId +
                '}';
    }
}
