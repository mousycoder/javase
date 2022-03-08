package com.mousycoder.test7;

import java.util.Date;
import java.util.Objects;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/25 8:36 PM
 */
public class Main {

    public static void main(String[] args) {
        String str1 = "javase";
        String str2 = "javase";
        System.out.println(Objects.equals(str1, str2));

        String[] arr1 = {"aa", "bb", "cc"};
        String[] arr2 = {"aa", "bb", "cc"};
//
//        System.out.println(Objects.deepEquals(arr1,arr2));
//
//        System.out.println(Objects.hashCode("xxxx"));
//        System.out.println(Objects.hashCode("xxxx."));


        System.out.println(Objects.hash("xdclass", new Date(), 12, 33L));


    }
}
