package com.mousycoder.test9;

import java.io.File;
import java.io.IOException;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/26 1:32 PM
 */
public class FileTest {

    public static void main(String[] args) {
        String dir = "/Users/mousycoder/My/1.todo/1111";

        String name = "t.txt";

//        File file = new File(dir, name);
        File file = new File(dir);

        //⽂件的 查询和判断
        System.out.println(File.separator);
        System.out.println("基本路径 getPath()= " + file.getPath());
        System.out.println("⽂件名 getName()= " + file.getName());
        System.out.println("绝对路径 getAbsolutePath = " + file.getAbsolutePath());
        System.out.println("⽗路径名 getParent() = " + file.getParent());
        System.out.println("是否是绝对路径 isAbsolute() = " + file.isAbsolute());
        System.out.println("是否是⼀个⽬录 isDirectory() = " + file.isDirectory());
        System.out.println("是否是⼀个⽂件 isFile() = " + file.isFile());
        System.out.println("⽂件或⽬录是否存在 exists() = " + file.exists());

        System.out.println("⽬录中的⽂件和⽬录的名称所组成字符串数组 list() ");
        String[] arr = file.list();
        for (String temp : arr) {
            System.out.println(temp);
        }

        //创建指定目录
        File mkdir = new File(dir+"/xd");
        mkdir.mkdir();


        //创建多级目录
        File mkdirs = new File(dir+"/xd/aaa/bb/cc");
        mkdirs.mkdirs();


        //创建一个文件
        File newFile = new File(dir+"/aaaa.txt");
//        try {
//             newFile.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        newFile.delete();


    }

}
