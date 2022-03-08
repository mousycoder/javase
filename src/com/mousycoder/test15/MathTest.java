package com.mousycoder.test15;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/27 1:33 PM
 */
public class MathTest {

    public static void main(String[] args) {
        System.out.println(Math.sqrt(16));
        System.out.println(Math.cbrt(8));
        System.out.println(Math.min(2.9,4.5));
        System.out.println(Math.ceil(-20.1));
        System.out.println(Math.floor(-20.1));


        System.out.println(Math.random());

        for (int i = 0 ; i < 50; i++){
            System.out.println((int)(Math.random() * 10 + 1));
        }




    }
}
