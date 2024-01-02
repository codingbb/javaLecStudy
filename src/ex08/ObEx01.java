package ex08;

class Account extends Object {
    private String author;
    private int number;
    private int balance;

    public Account(String author, int number, int balance) {
        this.author = author;
        this.number = number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "author='" + author + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}

public class ObEx01 {
    public static void main(String[] args) {
        Account account = new Account("홍길동", 1111, 1000);
        Account account2 = new Account("홍길동", 1111, 1000);
        System.out.println(account);
        System.out.println(account.toString());
        System.out.println(account.getClass());
        System.out.println(account.hashCode());

        if (account == account2) {
            System.out.println("같아여?");
        }

        if (account.equals(account2)) {
            System.out.println("같아여?");
        }

        if (account.toString().equals(account2.toString())) {
            System.out.println("같아여?");
        }

        String s1 = new String("물");
        String s2 = new String("물");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }
}
