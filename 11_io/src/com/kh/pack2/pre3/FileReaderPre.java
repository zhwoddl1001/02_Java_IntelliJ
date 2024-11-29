package com.kh.pack2.pre3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderPre {
    //파일을 읽고 읽은 내용을 눈으로 확인
    public void readTxt(){
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "happyLunch.txt";

        try {
            FileReader fr = new FileReader(path +fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
