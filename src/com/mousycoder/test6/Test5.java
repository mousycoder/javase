package com.mousycoder.test6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/24 8:12 PM
 */
public class Test5 {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("ddd");
        list.add("bbb");
        list.add("ccc");


        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.equalsIgnoreCase("ddd")){
                list.remove(next);
            }
        }
        System.out.println(list);


    }
}
