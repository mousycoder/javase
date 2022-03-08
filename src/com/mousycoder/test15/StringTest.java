package com.mousycoder.test15;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/27 2:02 PM
 */
public class StringTest {

    public static void main(String[] args) {

        String str1 = new String("xdclass   ");

        String str2 = "Xdclass";

        String str = "⼩滴课堂xdclass.net";

//获取字符串⻓长度:
        System.out.println(str.length());

//通过下标获取字符：
        char ch = str.charAt(5);
        System.out.println(ch);

//字符串⽐较：
        boolean result = str1.equals(str2);
        System.out.println(result);

//字符串⽐较忽略⼤⼩写
        boolean result1 = str1.equalsIgnoreCase(str2);
        System.out.println(result1);

//查找字符串出现的位置
        int index = str.indexOf(".");
        System.out.println(index);

//字符串截取

        String result2 = str.substring(index);
        System.out.println(result2);
        String result3 = str.substring(1, 3); //字符串拆分 ,注意正则，可以先简单知道
        System.out.println(result3);
        String[] arr = str.split("x");
        System.out.println(arr);

//字符串替换
//
        String temp = str.replace("x", "a");
        System.out.println(temp);

//字符串⼤⼩写转换

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

//字符串去除空格

        System.out.println(str1.length());
            System.out.println(str1.trim().length());


    }
}
