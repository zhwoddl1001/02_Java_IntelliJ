package com.kh.oop.constructorPre;

import java.util.Scanner;

public class CafeRun {

    //Scanner 이용해서 주문받고 주문 받은 내용을 출력하는 기능 생성
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.main()메서드 생성
        Cafe cafe = new Cafe();

        //2.main() 메서드 안에 Scanner 활용
        System.out.println("메뉴를 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.println("가격을 입력해주세요 : ");
        int price = sc.nextInt();
        System.out.println("수량을 입력해주세요 :");
        int quantity = sc.nextInt();

        //3.필수 생성자로 만들어진 객체 Scanner 로 작성한 입력값을 모두 받아
        Cafe c = new Cafe(name,price,quantity);
        // 변수명으로 저장
        //4.주문 출력
        System.out.println(c.toString());
        System.out.println( c.totalPrice(price,quantity));

    }
}
