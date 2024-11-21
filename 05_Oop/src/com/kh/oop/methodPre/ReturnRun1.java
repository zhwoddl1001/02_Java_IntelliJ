package com.kh.oop.methodPre;

public class ReturnRun1 {
    public static void main(String[] args) {
        ReturnPre1 r1 = new ReturnPre1();
       // System.out.println(r1.findId("감실식",5678));
        //System.out.println(r1.findId("홍길동",1234));
        int x = 3;
        int y = 5;

        r1.add(x,y);//값을 가지고만 있음 출력하는 코드작성
        r1.sub(x,y);
        r1.mul(x,y);
        r1.div(y,x);

        System.out.println(r1.add(x,y));
        System.out.println(r1.sub(x,y));
        System.out.println(r1.mul(x,y));
        System.out.println(r1.div(y,x));
    }
}
