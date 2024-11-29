package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;

public class FileWriterPre4 {

    //menu.txt
    //파일 존재 유무 확인하고 파일이 존재하면 이어쓰기
    public static void main(String[] args) {
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "menu.txt";
        File file = new File(path + fileName);
        try {
            if (!file.exists()) {

                file.createNewFile();
                System.out.println("파일을 성공적으로 만들었습니다." + fileName);
                FileWriter fw = new FileWriter(file, true);
                String content = "떡볶이\n순대\n마라탕";
                fw.write(content);
                fw.close();
                System.out.println("글자이어 붙이기 성공");

            } else {
                System.out.println("이미 동일한 파일이 있습니다." + fileName);
                FileWriter fw = new FileWriter(file, true);
                String content = "떡볶이\n순대\n마라탕";
                fw.write(content);
                fw.close();
                System.out.println("글자이어 붙이기 성공");
            }
        } catch (Exception e) {
            System.out.println("파일을 생성하지 못했습니다.");
            return;
        }
    }
}
