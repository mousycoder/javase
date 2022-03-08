package com.mousycoder.test6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/24 7:36 PM
 */
public class Test1 {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("ddd","ddd11");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry entry: entries){
            System.out.println("entry = " + entry.getKey() +"+ " + entry.getValue());
        }
    }
}
