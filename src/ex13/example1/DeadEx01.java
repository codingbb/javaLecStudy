package ex13.example1;

class Account {
    private int balance = 1000;

    synchronized public void withdraw(int amount) {
        if(amount <= balance) {
            System.out.println("출금완료 : " + amount);
            balance = balance - amount;
        } else {
            System.out.println("잔액이 부족합니다 : " + balance);
        }
    }
}

public class DeadEx01 {

    public static void main(String[] args) {
        Account account = new Account();

        new Thread(() -> {
            account.withdraw(1000);
        }).start();

        new Thread(() -> {
            account.withdraw(1000);
        }).start();

    }
}
