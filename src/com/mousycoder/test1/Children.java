package com.mousycoder.test1;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/23 9:38 PM
 */
public class Children extends Father{

    public Children() {
        super();
        System.out.println("Children.Children");

    }

    public Children(int age){
    }

    @Override
    public void sleep() {
        System.out.println("Children.sleep");
    }

    public void test(){
        sleep();
    }
}
