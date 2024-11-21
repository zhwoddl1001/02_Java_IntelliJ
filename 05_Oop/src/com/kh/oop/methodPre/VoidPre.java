package com.kh.oop.methodPre;

public class VoidPre {
    public void method1(double celsius){
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("섭씨"+ celsius + "도는 화씨" + fahrenheit + "입니다.");
    }

    public void method2(String name){
        System.out.println("학생이름"+ name);
    }
    public void method3(int price){
        System.out.println("상품명: 노트북, 가격" + price+ "원");
    }
    public void method4(int time){
        System.out.println("총" + time +"분 입니다.");
    }
    public void method5(String exercise,int duration  ){
        System.out.println("운동: " + exercise + "지속시간: " + duration + "분");
    }
    public void method6(int accountNumber, double balance ){
        System.out.println("계좌번호:"+ accountNumber +",잔액: "+ balance + "원");
    }
    public void method7(String title ,double rating ){
        System.out.println("영화제목"+ title+",평점: "+rating);
    }
    public void method8(String car, String topSpeed ){
        System.out.println("차량명:"+car+"최고속도: ");
    }
    public void method9(String recipient,String subject ){
        System.out.println("수신자:"+recipient+"제목:"+subject);
    }
    public void method10(String itemName,int quantity ){
        System.out.println("상품명:"+itemName+"수량"+quantity+"개");
    }
}
