package com.kg.poly.pack3.interfaceEx;

// Animal 을 상속받는 snake 은 무조건 eat 과 sleep 의 기능을 구현해야함
public class snake extends Animal {
    private int posion;

    @Override
    public String toString() {
        return "posison" + posion;
    }

    //Animal 클래스에서 완성되지 않은 기능 재정의
    @Override
    public void eat() {
        System.out.println("뱀은 한 번에 삼켜서 천천히 소화시킴");
    }

    @Override
    public void sleep() {
        System.out.println("뱀은 똬리를 틀고 잠을 잔다.");
    }
}
