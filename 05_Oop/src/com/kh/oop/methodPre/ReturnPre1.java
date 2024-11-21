package com.kh.oop.methodPre;

public class ReturnPre1 {

    //가상의 사용자 데이터
    //이름 핸드폰번호 아이디
    public String name ="홍길동"; //이름
    public  int phone = 1234; // 핸드폰 번호
    public  String id = "dongdong1004"; // 아이디

    //이름과 핸드폰 번호가 일치하는 아이디를 전달하기
    public String findId (String a,int b){
       // return "dongdong1004";

        if(name.equals(a) && phone ==b){//String은 참조형이기 때문에 equals 가능
           return id;
       }
        /*if(name.equals(a)){
             return id;
        }
       if(phone==b){// int 기본타입은 == 사용
           return id;
       }*/
        return "아이디를 찾을 수 없습니다.";

    }

    //계산기

    public double add(double a,double b){
        return a+b;
    }
    public double sub(double a,double b){
        return a-b;
    }
    public double mul(double a,double b){
        return a*b;
    }
    public double div(double a,double b){
        return a/b;
    }

}
