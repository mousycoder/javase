package com.mousycoder.test14;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/26 8:34 PM
 */
public class WriterTest {

    public static void main(String[] args) throws IOException {
        test4();
    }

    public static void test3() throws IOException {

        String dir = "/Users/mousycoder/My/1.todo/test6/writer.txt";

        FileWriter writer = new FileWriter(dir);
        writer.write(23567);
        writer.write(28404);
        writer.write(35838);
        writer.write(22530);
        writer.write("23567");
        writer.flush();
        writer.close();

    }

    public static void test4() throws IOException {

        String dir = "/Users/mousycoder/My/1.todo/test6/writer.txt";

        FileWriter writer = new FileWriter(dir, false);
        writer.write(23567);
        writer.write(28404);
        writer.write(35838);
        writer.write(22530);
        writer.write("23567");
        writer.flush();
        writer.close();

    }
}
