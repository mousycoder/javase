package com.mousycoder.test14;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/26 10:30 PM
 */
public class OutputStreamWriterTest {

    public static void main(String[] args) throws Exception{
        test1("/Users/mousycoder/My/1.todo/test6/11.txt");

    }

    private static void test1(String path)throws Exception {
        OutputStream out = new FileOutputStream(path);
        OutputStreamWriter osr = new OutputStreamWriter(out,"GBK");
        BufferedWriter bw = new BufferedWriter(osr);

        String str = "欢迎来到小D";

        bw.write(str);
        bw.newLine();
        bw.write("学习Java课程");
        bw.flush();
        bw.close();

    }


}
