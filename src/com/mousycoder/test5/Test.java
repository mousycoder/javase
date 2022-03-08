package com.mousycoder.test5;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/24 3:39 PM
 */
public class Test {
    public static void main(String[] args) {
        int divide = divide(25, 0);
        System.out.println("divide = " + divide);
    }

    public static int divide(int num1, int num2) {
        try {
            int result = num1 / num2;
            return result;
        } catch (Exception e) {
            System.out.println("出异常");

        } finally {
            System.out.println("finally执⾏了");
            return -2;

        }

// }

    }
}
