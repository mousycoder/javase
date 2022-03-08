package com.mousycoder.test10;

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
        File file = new File(dir,name);
        InputStream inputStream = new FileInputStream(file);
        testReadByteArr(inputStream);
    }

    public static void testRead(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        System.out.println(read );
        System.out.println((char) read );

    }


    public static void testSkip(InputStream inputStream) throws IOException {
        long skipSize = inputStream.skip(3);
        System.out.println(skipSize );
        int read = inputStream.read();
        System.out.println(read );
        System.out.println((char) read );

    }

    public static void testReadByteArr(InputStream inputStream) throws IOException {


        byte[] buf = new byte[inputStream.available()];

        int length ;

        while ( (length = inputStream.read(buf)) != -1 ){
//            System.out.print(new String(buf,0,length));
            System.out.println(new String(buf,0,length));

        }

        inputStream.close();



    }


}
