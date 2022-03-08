package com.mousycoder.test9;

import java.io.File;
import java.io.IOException;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/26 2:38 PM
 */
public class Main {

    public static void main(String[] args) throws IOException {
        createDir("/Users/mousycoder/My/1.todo");
    }

    public static void createDir(String path) throws IOException {
        File rootDir = new File(path+ File.separator+ "test2");
        if (!rootDir.exists()){
            rootDir.mkdir();
        }

        for (int i = 0; i < 10; i++) {
            String dirPath = rootDir + File.separator + (i+1);
            File folder = new File(dirPath);
            if (!folder.exists()){
                folder.mkdir();
                String txtPath  = dirPath + File.separator + (i+1)+".txt";
                System.out.println(txtPath);
                File txtFile = new File(txtPath);
                if (!txtFile.exists()){
                    txtFile.createNewFile();
                }
            }
        }


    }
}
