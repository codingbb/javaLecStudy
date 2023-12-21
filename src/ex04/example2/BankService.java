package ex04.example2;

import ex04.example2.model.Account;

//트랜잭션 관리
public class BankService {

    public static void 이체(Account senderAccount, Account receiverAccount, long amount) {    //타입으로 객체를 전달받음!!
        if(amount <= 0) {
            System.out.println("0원 이하 금액 이체 불가능");
            return;
        }

        //0원 이하를 이체하면 아래의 코드는 실행x (return 때문에)
        senderAccount.출금(amount);
        receiverAccount.입금(amount);
    }
}
