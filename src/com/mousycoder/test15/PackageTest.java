package com.mousycoder.test15;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/27 2:53 PM
 */
public class PackageTest {

    private static Float f4;

    private static float f5;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int i1 = 0;
        Integer integer = new Integer(i1);
        Integer integer1 = new Integer(2);

        Boolean b = new Boolean(true);
        Boolean.valueOf(true);

        int i = integer.intValue();
        b.booleanValue();

        System.out.println(f4);
        System.out.println(f5);

    }
}
