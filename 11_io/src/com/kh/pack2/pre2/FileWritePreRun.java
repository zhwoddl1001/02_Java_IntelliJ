package com.kh.pack2.pre2;

import java.io.File;

public class FileWritePreRun {
    public static void main(String[] args) {
        String path = System.getProperty("user.home")+ "/Desktop/";
        String fileName ="user.txt";
        String 확장자명칭 = ".txt";
       FileWritePre fwp = new FileWritePre();
       System.out.println("===["+fileName+"]생성 시작===");
       fwp.createTxt(path,fileName + 확장자명칭);
        System.out.println("===["+fileName+"]작성 시작===");
       fwp.WriteTxt(path,fileName);
    }
}
