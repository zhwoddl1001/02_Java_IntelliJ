package com.kh.oop.bank;

public class AccountRun{
    public static void main(String[] args){
        Account acc = new Account();

        //set을 이용해서 간접 접근하기
        acc.setName("동그라미");
        acc.setAccountNumber("1234-56-789");
        acc.setBalance(100);
        acc.setPassword("1234");

        System.out.println(acc.getName());
        System.out.println(acc.getAccontNumber());
        System.out.println(acc.getBalance());
        System.out.println(acc.getPassword());
        //balace 실수 자료형에는 정수형이 들어갈 수 있음
        //왜냐하면 정수형에는 기본적으로 뒤에.0존재
        //정수이기 때문에 실수형으로 변환하거나 넣어줄 깨만 보임

        System.out.println("===계좌에 입금을 시작합니다.===");
        //계좌에 입금하기
        acc.deposit(1234);
        acc.deposit(100000);

        System.out.println("===계좌에 출금을 시작합니다===");
        acc.withdraw(1234);
        acc.withdraw(1000000);
        acc.withdraw(50000);

    }

}
