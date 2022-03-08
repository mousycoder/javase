package com.mousycoder.test15;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/27 3:10 PM
 */
public class EnumTest {

    public static final int MONDAY = 1;

    public static final int TUESDAY = 2;

    public static final int WEDNESDAY = 3;

    public static void main(String[] args) {
        DayEnum dayEnum = DayEnum.WEDNESDAY;
        String name = dayEnum.name();
//        System.out.println(name);
//        System.out.println(dayEnum.ordinal());
//        System.out.println(dayEnum.toString());



        DayEnum[] values = DayEnum.values();
        for (DayEnum value : values) {
            System.out.println(value.name());
        }


    }

}

enum DayEnum {
    MONDAY, TUESDAY, WEDNESDAY
}

enum SexEnum {
    BOY, GIRL
}
