package com.mousycoder.test11;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/26 2:58 PM
 */
public class Main {

    public static void main(String[] args) throws IOException {

        String dir = "/Users/mousycoder/My/1.todo/test3";
        String name = "a.txt";
        File file = new File(dir, name);
        InputStream inputStream = new FileInputStream(file);
        OutputStream outputStream = new FileOutputStream(dir+File.separator+"b.txt",true);
        testOutBuf(inputStream, outputStream);
    }


    public static void testOut(InputStream inputStream, OutputStream outputStream) throws IOException {
        int value = 0;
        while ((value = inputStream.read()) != -1) {
            System.out.println(value);
            outputStream.write(value);
        }

        inputStream.close();
        outputStream.close();
    }

    public static void testOutBuf(InputStream inputStream,OutputStream outputStream) throws IOException {
        byte[] buf = new byte[1024];
        int length ;
        while ((length = inputStream.read(buf)) != -1){
            outputStream.write(buf,0,length);
        }
        inputStream.close();
        outputStream.close();
    }


}
