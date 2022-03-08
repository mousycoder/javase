package com.mousycoder.test6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/24 8:43 PM
 */
public class Test7 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("zzz");
        list.add("cccc");
        System.out.println(list);
        Collections.shuffle(list);
    }
}
