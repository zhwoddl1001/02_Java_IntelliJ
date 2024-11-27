package com.kh.CollectionEx.pack2.setEx;

import java.util.HashSet;

public class 회원기능 {
    //1.회원 객체 생성 userList
    HashSet<회원> userList = new HashSet<>();
    //2.회원 추가 기능 adduserList
    public void adduserList(회원 id) {
        if(userList.add(id)){
            System.out.println("회원을 추가했습니다." + id);
        }else {
            System.out.println("이미 추가된 회원입니다." + id);
        }
    }
    //3.회원 모두 조회 기능 allUser
    public void allUser(){
        if(userList.isEmpty()){
            System.out.println("조회할 회원이 없습니다.");
        }else{
            for(회원 u : userList){
                System.out.println(u);
            }
        }

    }
    //4.회원 검색 기능 search(int id)
        public void searchUser(int id){
        for(회원 u : userList){
            if(u.getId() == id){
                System.out.println(u);
            }else {
                System.out.println("회원이 존재하지 않습니다.");
            }
        }
        }
    //5.회원 삭제 기능 deleteUser(int id)
    public void deleteUser(int id){
       for(회원 u : userList){
           if(u.getId() == id){
               userList.remove(u);
               break;
           }
       }
       System.out.println("해당 메뉴가 삭제되었습니다.");
    }
}
