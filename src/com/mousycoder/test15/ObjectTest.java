package com.mousycoder.test15;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/27 1:22 PM
 */
public class ObjectTest {

    public static void main(String[] args) {
        Class<? extends ObjectTest> clazz = new ObjectTest().getClass();
        System.out.println(clazz.getPackageName());
    }
}
