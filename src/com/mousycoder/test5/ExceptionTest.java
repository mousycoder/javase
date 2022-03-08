package com.mousycoder.test5;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/24 3:32 PM
 */
public class ExceptionTest {

    public static void main(String[] args) {

        try {
            int result = 10/0;
            System.out.println("result = " + result);
        } catch (Exception e){
            e.printStackTrace();
            String message = e.getMessage();
            StackTraceElement[] stackTrace = e.getStackTrace();

        }

    }
}
