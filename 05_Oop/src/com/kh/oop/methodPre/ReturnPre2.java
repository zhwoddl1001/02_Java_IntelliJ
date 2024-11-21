package com.kh.oop.methodPre;

public class ReturnPre2 {
    // 1.이름과 나이를 입력받아 소개 메세지를 반환
    // 안녕하세요 제이름은 홍길동이고 나이는 40세 입니다.
    public String in(String name, int age) {
        return "안녕하세요 제이름은 "+name + " 이고 " +"나이는" +age + " 세 입니다.";
    }
    
    
    //2.두 숫자를 입력받아 가장 큰 숫자 반환 Scanner X
    // num1 과 num2 비교해서 큰 값의 숫자를 출력
    //000보다 000이 큰 숫자 입니다.

    public String compare(int num1, int num2) {
        if (num1 > num2) {
            return "출력결과 :" + num2 + "보다" + num1 + "이(가) 큰 숫자입니다.";
        } else if (num1 < num2) {
            return "출력결과 :" + num1 + "보다" + num2 + "이(가) 큰 숫자입니다.";
        }
        return "잘못 입력하셨습니다.";
    }

    //3.입력된 정수에 따라 등급 반환
    //90 A 80 B 70 C 60 D 나머지 F char 이용
    public char grade (int score) {
        if (score>=90){
            return 'A';
        } else if (score>=80) {
            return 'B';
        } else if (score>=70) {
            return 'C';
        } else if (score>=60) {
            return 'D';
        }else {
            return 'F';
        }
    }

    public String Totalprice(int price,int discountRate ){
        return "원래 가격:"+price+ "할인율:"+discountRate+"% 최종 금액: " + price * discountRate/100;
    }

   /* public String practice5(){

    }*/

    public String practice6(int age ){
        if(age>19){
            return "나이: "+age +"결과: 성입입니다.";
        }else {
            return "나이: "+age+"결과: 미성년자입니다.";
        }
    }
    public String practice7(String str1,String str2 ){
        return str1+str2;
    }
}
