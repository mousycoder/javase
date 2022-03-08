package com.mousycoder.test14;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/26 9:41 PM
 */
public class InputStreamReaderTest {

    public static void main(String[] args) throws Exception{
        test1("/Users/mousycoder/My/1.todo/test6/11.txt");
    }

    public static void test1(String path) throws Exception{
        InputStream in = new FileInputStream(path);
        InputStreamReader isr = new InputStreamReader(in,"GBK");
        BufferedReader reader = new BufferedReader(isr);

        String line ;
        while ((line = reader.readLine())!= null){
            System.out.println(line);
        }

        isr.close();
        reader.close();


    }
}
