package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritePre3 {
    public static void main(String[] args) {
        String path = System.getProperty("user.home") + "/Desktop/";
        File file = new File(path + "menus.txt");

        if (file.exists()) {//file.getAbsolutePath() 파일 경로 보여줌
            System.out.println("이미 존재하는 파일입니다." + file.getAbsolutePath());
            return;
        }else {
            try {
                file.createNewFile();
                System.out.println("파일을 성공적으로 만들었습니다.");
            } catch (IOException e) {
                System.out.println("파일을 생성하지 못했습니다." + e.getMessage());
                return;
            }
        }

        try {
            FileWriter fw = new FileWriter(file,true);
         //   String content = "양식\n한식\n중식\n일식";
            Scanner sc = new Scanner(System.in);
            System.out.print("작성할 내용을 입력하세요 : ");
            String content = sc.nextLine();
            fw.write(content); // 파일에 내용 작성하기
            fw.close();
            System.out.println("글자생성 및 이어붙이기 성공!");
        } catch (IOException e) {
            System.out.println("글자 이어붙이기 실패!");

        }finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
