package com.mousycoder.test2;

public class Children extends Father {

    static {
        System.out.println("Child静态代码块");
    }

    public Children() {
        super();
        System.out.println("Child⽆参构造函数");
        super.sleep();
    }

    @Override
    public void sleep() {
        System.out.println("Child sleep⽅法");
    }


    public static void main(String[] args) {
        new Children().sleep();
    }
}