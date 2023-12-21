package ex04.example2;

import ex04.example2.model.Account;

//트랜잭션 관리
public class BankService {

    public static void 출금(Account withdrawAccount, long amount) {
        //출금의 트랜지션 (과정 3개)
        //0원 검증
        if(amount <= 0) {
            System.out.println("0원 이하 금액 출금 불가능");
            return;
        }
        if(withdrawAccount.잔액부족하니(amount)){
            System.out.println("잔액이 부족합니다");
            return;
        }
        withdrawAccount.출금(amount);
    }


    public static void 이체(Account senderAccount, Account receiverAccount, long amount) {    //타입으로 객체를 전달받음!!
        //이 코드는 상태를 확인하는 것도, 변경하는 것도 아님 (검증하는 것 = 벨리데이션?)
        //이게 이체 트랜지션
        if(amount <= 0) {
            System.out.println("0원 이하 금액 이체 불가능");
            return;
        }

        if(senderAccount.잔액부족하니(amount)){
            System.out.println("잔액이 부족합니다");
            return;
        }

        //0원 이하를 이체하면 아래의 코드는 실행x (return 때문에)
        senderAccount.출금(amount);
        receiverAccount.입금(amount);
    }
}
