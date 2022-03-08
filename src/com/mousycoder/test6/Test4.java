package com.mousycoder.test6;

import java.util.*;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/24 7:55 PM
 */
public class Test4 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("xxx");
        set.add("aaa");
        set.add("tom");
        set.add("jack");
        set.add("jack");
        set.add(null);
        set.add(null);

        System.out.println("set = " + set);
        System.out.println(set.size());
        List<String> list = new ArrayList<>();
        Iterator<String> iterator = list.iterator();
        iterator.remove();


    }
}
