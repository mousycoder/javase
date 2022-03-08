package com.mousycoder.test13;

import java.io.*;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/26 7:24 PM
 */
public class Main {

    public static void main(String[] args) throws IOException {
        String sourceDir = "/Users/mousycoder/My/1.todo/test4";
        String targetDir = "/Users/mousycoder/My/1.todo/test5";

        File sourceFile = new File(sourceDir);
        for (String fileName : sourceFile.list()) {
            copyFile(sourceFile + File.separator + fileName ,targetDir + File.separator + fileName);
        }
    }

    private static void copyFile(String sourceFile, String targetFile) throws IOException {
        File target = new File(targetFile).getParentFile();
        if (!target.exists()){
            target.mkdir();
        }



        System.out.println(sourceFile + "->" + targetFile);
        FileInputStream fis = new FileInputStream(sourceFile);
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream(targetFile);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int size ;
        byte [] buf = new byte[1024];
        while ((size = (bis.read(buf)))!= -1){
            bos.write(buf,0,size);
            System.out.println(buf.toString() + " .. " + size);
        }
        bis.close();
        bos.close();
    }
}
