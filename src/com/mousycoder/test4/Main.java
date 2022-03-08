package com.mousycoder.test4;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/24 2:54 PM
 */
public class Main {

    public static void main(String[] args) {
        Student s = new Student();
        boolean b = s instanceof Person;
        System.out.println(b);

        Person p1 = new Student();
        Student a = (Student)p1;
        System.out.println("a = " + a);
    }
}
