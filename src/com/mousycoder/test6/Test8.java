package com.mousycoder.test6;

import java.util.*;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/24 9:04 PM
 */
public class Test8 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("springboot");
        list.add("微服务");
        list.add("架构");
//
//        list = Collections.unmodifiableList(list);
//        list.add("html");


        Set<String> set = new HashSet<>();
        set.add("mysql");
        set.add("linux");

        set = Collections.unmodifiableSet(set);
        set.add("test");
    }
}
