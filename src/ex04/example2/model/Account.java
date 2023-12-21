package ex04.example2.model;

//객체의 상태를 변경, 객체의 상태를 확인
public class Account {
    private final int id;
    private long balance;
    private int userId; //account id랑 구분하기 위해서 userId

    //긍정으로 물어봐서 내가 원하는 결과를 true로 받자
    public boolean 잔액부족하니(long amount) {
        if(balance < amount) {
            return true;
        }
        return false;
    }

    //메서드는 하나의 일(책임)만 하게 만들기. 애는 출금이니까 출금!!하는 기능만.
    //만약 이체라고 했으면 출금도 해야하고 입금도 해야하니까 나중에 문제가 생겼을때 출금이 잘못된건지 입금이 잘못된건지 구분하기가 어렵다.
    public void 출금(long amount) {
        this.balance = this.balance - amount;
    }

    public void 입금(long amount) {
        this.balance = this.balance + amount;
    }

    //상태가 나오면 생성자와 toString은 디폴트로 깔아주기
    public Account(int id, long balance, int userId) {
        this.id = id;
        this.balance = balance;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", userId=" + userId +
                '}';
    }
}
