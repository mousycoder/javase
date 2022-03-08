package com.mousycoder.test14;

import java.io.*;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/26 8:13 PM
 */
public class ReaderTest {

    public static void main(String[] args) throws IOException {
        test3();
    }

    public static void test1() throws IOException {
        String path = "/Users/mousycoder/My/1.todo/test6/a.txt";
        File file = new File(path);

        Reader input = new FileReader(file);

        int ch;
        while ( (ch =input.read()) != -1){
            System.out.println(ch);
        }

        input.close();
    }


    public static void test2() throws IOException {
        String path = "/Users/mousycoder/My/1.todo/test6/a.txt";
        File file = new File(path);

        Reader input = new FileReader(file);


        char[] ch = new char[1024];

        int length ;

        while ((length = input.read(ch)) != -1){
            System.out.println(new String(ch,0,length));
        }

        input.close();
    }


    public static void test3() throws IOException {
        String path = "/Users/mousycoder/My/1.todo/test6/a.txt";
        File file = new File(path);

        Reader input = new StringReader("ffffffff");

        char[] ch = new char[1024];

        int length ;

        while ((length = input.read(ch)) != -1){
            System.out.println(new String(ch,0,length));
        }

        input.close();
    }
}
