package com.kh.pack2.pre2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritePre {
    /*
    * createTxt(path, fileName
    * @param path 파일 경로
    * @param fileName 파일 이름
    * user.txt
    * */
    public void createTxt(String path, String fileName) {
        File file = new File(path+fileName);

        try {
            if (file.exists()) {
                System.out.println("이미 있는 파일입니다." + fileName);
                return;
            }else {
                file.createNewFile();
                System.out.println("성공적으로 파일을 생성했습니다." + fileName);
            }
        } catch (IOException e) {
            System.out.println("파일을 생성할 수 없습니다." + fileName);
        }
    }
    /*
     * WriterTxt(String path, String fileName)
     * @param path      = 파일 경로
     * @param fileName  = 파일 이름
     * user.txt
     * */

    public void WriteTxt(String path, String fileName) {
        File file = new File(path+fileName);
        if (!file.exists()) {
            System.out.println("파일이 존재하지 않습니다." + fileName);
            return;
        }
        Scanner sc = new Scanner(System.in);
        try {
            FileWriter fw = new FileWriter(file,true);
            System.out.println("작성할 내용을 입력 해주세요 : ");
            String content = sc.nextLine();
            fw.write(content);
            fw.close();
        }catch (IOException e) {
            System.out.println("작성할 내용이 없습니다.");
        }finally {
            sc.close();
            System.out.println("파일을 모두 작성했습니다.");
        }

    }
}
