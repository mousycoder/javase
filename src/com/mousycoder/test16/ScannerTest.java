package com.mousycoder.test16;

import java.util.Scanner;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/27 7:07 PM
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入字符串");
            String input = scanner.nextLine();

            if ("886".equals(input)) {
                System.out.println("欢迎下次使用");
                break;
            } else {
                System.out.println("您输入的是：" + input);
            }
        }
        scanner.close();
    }
}
