package com.mousycoder.test2;

public class Father {

    static {
        System.out.println("⽗类静态代码块");
    }

    public Father() {
        System.out.println("father ⽆参构造函数");
    }

    public Father(int age) {
        System.out.println("father 有参构造函数");
    }

    public void sleep() {
        System.out.println("father sleep⽅法");
    }

}