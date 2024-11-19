package com.kh.pratice.condition;

import java.util.Scanner;

//switch case 문으로 나이를 입력받고
//나이가 13세 이하면 어린이
//      18세 이하면 청소년
//      19세 이상 성인 출력
// 메서드명 = methodAge()
//최종 실행 conditionPreRun 진행
public class ConditionPre {
    public void methodAge() {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        switch (age / 10) {
            case 0:
            case 1:
                System.out.println("어린이 입니다.");
                break;
            case 2:
                if (age <= 18) {
                    System.out.println("청소년 입니다.");

                } else {
                    System.out.println("어른입니다.");

                }
                break;

            default:
                System.out.println("성인입니다.");
                break;
        }
    }
}
