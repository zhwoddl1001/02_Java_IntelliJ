package com.kg.poly.pack2.maver;

public class 메이버카페 extends 메이버회원{
   private String 카페권한;
   private String 가입카페명;
    //카페권한
    //가입카페명

    //기본생성자
    public 메이버카페(){
        super();
    }


    //필수생성자
    public 메이버카페(String 유저이름, String 유저번호, String 유저주소, String 유저나이, String 카페권한,String 가입카페명) {
        super(유저이름, 유저번호, 유저주소, 유저나이);
        this.카페권한 = 카페권한;
        this.가입카페명 = 가입카페명;
    }
    //Setter
    public void set카페권한(String 카페권한) {
        this.카페권한 = 카페권한;
    }

    public void set가입카페명(String 가입카페명) {
        this.가입카페명 = 가입카페명;
    }
    //getter
    public String get카페권한() {
        return 카페권한;
    }

    public String get가입카페명() {
        return 가입카페명;
    }
   //toString
    //  '\'' -> 작은 따옴표 출력
    @Override
    public String toString() {
        return "메이버카페{" +super.toString()+'\''+
                "카페권한='" + 카페권한 + '\'' +
                ", 가입카페명='" + 가입카페명 + '\'' +
                '}';
    }
}

/*
 메이버실행에서 메이버카페에 가입한
 박철수 010-1234-5678 서울시 종로구 30 "회원" "요리 카페" 출력 toString
* */
