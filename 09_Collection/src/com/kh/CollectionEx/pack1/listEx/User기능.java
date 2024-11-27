package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class User기능 {
    //1. 저장된 사용자들을 저장할 목록 생성
    private ArrayList<User> userList = new ArrayList<>();

    //2.스캐너 사용
    private Scanner sc = new Scanner(System.in);

    //3.사용자 추가 기능 만들기!
    public void addUser() {
        System.out.print("유저이름 : ");
        String name = sc.nextLine();

        System.out.println("패스워드 : ");
        String password = sc.nextLine();

        System.out.println("이메일 :");
        String email = sc.nextLine();

        //새 User 객체를 생성하고 리스트에 추가
        User user = new User(name, password, email);
        userList.add(user);// 새로 만들어진 유저를 담고 있는 변수를 유저 리스트목록에 추가

    }

    //4. 유저 목록 조회하기
    public void allUsers() {

        System.out.println("\n ===추가된 사용자 목록 ===");
        if(userList.isEmpty()) {
            System.out.println("등록된 사용자가 없습니다.");

        }else {
            for(int i = 0; i < userList.size(); i++) {
                System.out.println(userList.get(i).toString());
            }
        }
        /******** 향상된 for 문
        for(User user : userList) {
            System.out.println(user.toString()); userList에 작성되어있는 유저목록을 하나씩 꺼내서 user에 순차적으로 담아줌
        }
        ***********/
        //만약에 등록된 사용자가 없다면 "등록된 사용자가 없습니다." 출력

        //사용자가 1명이라도 없다면 향상된 for문을 이용해서 유저들을 모두 출력
    }
    
    //5. 유저 제거 기능
    public void removeUser() {
        System.out.println("\n===사용자 제거===");
        System.out.print("제거하고자 하는 사용자의 이름을 입력하세요");
        String username = sc.nextLine();
        boolean found = false;

        for(int i = 0; i < userList.size(); i++) {
            //만약에 사용자이름이 유저목록에 일치하는 유저가 존재한다면
            if(userList.get(i).getUsername().equals(username)) {
                userList.remove(i); // 해당하는 index번호를 삭제
                System.out.println("["+username+"] 회원이 성공적으로 삭제되었습니다.");
                found = true;
                break;
            }
        }
        //만약에 일치하는 유저가 없다면
        if(!found) {
            System.out.println("[" + username+"] 회원을 찾을 수 없습니다.");
        }


    }
}
