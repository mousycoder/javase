package com.mousycoder.test6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/24 8:27 PM
 */
public class Test6 {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("ddd","ddd");
        map.put("ccc","cccc");

        Set<Map.Entry<String, String>> entries = map.entrySet();



        Iterator<Map.Entry<String, String>> iterator =
                entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey());
            System.out.println(next.getValue());
        }
    }
}
