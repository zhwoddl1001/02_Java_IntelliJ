package com.kg.poly.pack3.interfacePre;

//추상 클래스 엄마 : 엄마는 요리를 잘한다
public abstract class 엄마 {
    public void cook(){
        System.out.println("엄마는 요리를 잘합니다.");
    }

    //자식이 만드시 구현해야하는 추상 메서드
    public abstract void 예의();
}
