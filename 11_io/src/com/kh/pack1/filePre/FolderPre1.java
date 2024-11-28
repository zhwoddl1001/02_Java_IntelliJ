package com.kh.pack1.filePre;

import java.io.File;
import java.io.IOException;

public class FolderPre1 {
    // 1. 바탕화면에 profileImg 라는 폴더가 존재하는지 확인하고
    //    존재하지 않으면 폴더 생성 존재하면 이미 존재하는 폴더입니다. 출력
    public void method1(){
        File folder = new File(System.getProperty("user.home") +"/Desktop/profileImg");

        if(folder.exists()){
            System.out.println("이미 존재하는 폴더입니다.");
        }else {
            folder.mkdir();
            System.out.println("폴더를 생성하였습니다.");
        }
    }
    
    //method2 : 파탕화면에 newFile.txt 생성
    public void method2(){
        File folder = new File(System.getProperty("user.home") +"/Desktop/newFile.txt");

        if(folder.exists()){
            System.out.println("이미 생성된 파일이 있습니다.");
        }else {
            try {
                folder.createNewFile();
                System.out.println("파일을 만드는데 문제가 생겼습니다." + folder);
            } catch (IOException e) {

            }
            System.out.println("파일을 성공적으로 생성했습니다.");
        }
    }
}
