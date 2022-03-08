package com.mousycoder.test14;

import javax.xml.catalog.Catalog;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/26 10:37 PM
 */
public class TryCatchTest {

    public static void main(String[] args) throws Exception {

        test1();
//        BufferedInputStream bis = null;
//        BufferedOutputStream bos = null;
//
//        try {
//
//            FileInputStream fis = new FileInputStream("/Users/mousycoder/My/1.todo/test6/writer.txt");
//            bis = new BufferedInputStream(fis);
//
//            FileOutputStream fos = new FileOutputStream("/Users/mousycoder/My/1.todo/test6/writer_copy.txt");
//            bos = new BufferedOutputStream(fos);
//
//            int size;
//            byte[] buf = new byte[1024];
//            while ((size = bis.read(buf)) != -1) {
//                bos.write(buf, 0, size);
//            }
//
//        } catch (Exception e) {
//
//        } finally {
//            if (bis != null) {
//                try {
//                    bis.close();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                } finally {
//                    if (bos != null) {
//                        try {
//                            bos.close();
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }
//            }
//        }
    }

    public static void test1() throws Exception {
        try (FileInputStream fis = new FileInputStream("/Users/mousycoder/My/1.todo/test6/writer.txt");
             BufferedInputStream bis = new BufferedInputStream(fis);
             FileOutputStream fos = new FileOutputStream("/Users/mousycoder/My/1.todo/test6/writer_copy.txt");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
        ) {
            int size;
            byte[] buf = new byte[1024];
            while ((size = bis.read(buf)) != -1) {
                bos.write(buf, 0, size);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
