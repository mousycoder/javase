package com.mousycoder.test14;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/26 9:31 PM
 */
public class BufferedWriterTest {

    public static void main(String[] args) throws Exception {
        test1("/Users/mousycoder/My/1.todo/test6/8.txt");
    }

    private static void test1(String path) throws Exception{
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        String other = "你好啊";
        writer.write(other.toCharArray(),0,other.length());
        writer.newLine();
        writer.write("我是胡浩".toCharArray(),0,"我是胡浩".length());
        writer.close();
    }
}
