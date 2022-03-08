package com.mousycoder.test8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/25 9:46 PM
 */
public class QuestionTest {

    public static void main(String[] args) {
        testCounter();
    }

    public static void testCounter() {
        String str = "*Constructs a new <tt>HashMap</tt> " +
                "⼩滴课堂 with the same mappings as the * " +
                "⼩滴课堂 specified <tt>Map</tt>. " +
                "The <tt>HashMap</tt> is created with default load factor (0.75) " +
                "and an initial capacity sufficient to*hold the mappings in the " +
                "specified <tt>Map</tt>.";

        char[] charArr = str.toCharArray();
        Map<Character,Integer> counterMap = new HashMap<>();

        for (int i = 0 ; i < charArr.length;i++){
            Integer value = counterMap.get(charArr[i]);
            if (value == null){
                counterMap.put(charArr[i],1);
            }else {
                value +=1;
                counterMap.put(charArr[i],value);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = counterMap.entrySet();

        for (Map.Entry<Character, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " 字符出现的次数 ：" + entry.getValue());
        }


    }
}
