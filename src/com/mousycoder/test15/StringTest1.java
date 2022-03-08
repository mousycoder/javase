package com.mousycoder.test15;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/27 2:35 PM
 */
public class StringTest1 {

    public static void main(String[] args) {
        boolean bool = Boolean.getBoolean("True"); //字符串类型转换为布尔类型
        System.out.println(bool);
        int integer = Integer.parseInt("20"); //字符串类型转换为整形 　
        long LongInt = Long.parseLong("1024"); //字符串类型转换为⻓长整形 　　\
        System.out.println(LongInt);
        float f = Float.parseFloat("1.521"); //字符串类型转换为单精度浮点型 　　
        System.out.println(f);
        double d = Double.parseDouble("1.52123");//字符串类型转换为双精度浮点型
    }
}
