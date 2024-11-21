package com.kh.oop.field.pack2;

import com.kh.oop.field.pack1.FieldEx1;

//                         프로텍트를 사용하기 위해 FieldEx1을 상속(extends)한다 라는 표기
//                         프로텍트 필드를 상속하더라고 Staric main()기능에 바로 올라올 순 없음
//  public return method(){}  public void method(){}
//          method(){}내부에 작성해서 사용하기만 가능
public class FieldRun2 extends FieldEx1 {
    public static void main(String[] args) {
        //FieldEx1 pu
        FieldEx1 f1 = new FieldEx1();

        System.out.println(f1.퍼블릭필드);//어디서든 접근이 가능
        //System.out.println(f1.프로텍트필드);//같은 패키지 or 다른패키지 상속이라는걸 써야가능
        //System.out.println(f1.디폴트필드);// 오직 같은 패키지에서만 가능
        //System.out.println(f1.프라이빗필드);//같은 클래스만 가능
    }

    public  void method(){
        //상속을 진행한다는 것은 상속이후에 특정 변화가 일어나고
        //변화가 일어난 이후의 값을 기능에 담아 static 전달
        //다른 패키지이지만 상속 상태이기 때문에
        //기능 내부에 호출해서 사용
        System.out.println(프로텍트필드);
    }
}
