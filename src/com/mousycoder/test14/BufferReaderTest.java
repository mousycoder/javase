package com.mousycoder.test14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/26 8:44 PM
 */
public class BufferReaderTest {

    public static void main(String[] args) throws IOException {
        test2("/Users/mousycoder/My/1.todo/test6/writer.txt");
    }

    public static void test1(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader reader = new BufferedReader(fileReader);


        if (!reader.ready()){
            System.out.println("文件流暂时无法读取");
            return;
        }

        int size;

        char[] cbuf = new char[1024];
        while ((size = reader.read(cbuf,0,cbuf.length)) != -1){
            System.out.println(new String(cbuf,0,size));
        }
        reader.close();

    }



    public static void test2(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader reader = new BufferedReader(fileReader);


        if (!reader.ready()){
            System.out.println("文件流暂时无法读取");
            return;
        }

        int size;

        String str = "";
        while ((str = reader.readLine()) != null){
            System.out.println(str);
        }
        reader.close();

    }
}
