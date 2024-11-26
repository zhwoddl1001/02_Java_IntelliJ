package com.kg.poly.pack3.interfaceEx;

public class AnimalRun {
    //추상 클래스는 미완성된 클래스이기 때문에 객체 생성 불가
    public static void main(String[] args) {
        snake snake = new snake();
        snake.eat();
        snake.sleep();
    }

}
