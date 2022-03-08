package com.mousycoder.test12;

import java.io.*;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/26 7:03 PM
 */
public class BufferMain {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("/Users/mousycoder/My/1.todo/test4/a.txt");

            BufferedInputStream bis = new BufferedInputStream(fis);

            FileOutputStream fos = new FileOutputStream("/Users/mousycoder/My/1.todo/test4/b.txt");

            BufferedOutputStream bos = new BufferedOutputStream(fos);


            int size ;

            byte[] buf = new byte[1024];

            while ((size = bis.read(buf) ) != -1 ){
                bos.write(buf,0,size);
            }

            bis.close();
            bos.close();
        }catch (Exception e){

        }
    }
}
