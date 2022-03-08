package com.mousycoder.test15;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/27 2:44 PM
 */
public class SystemTest {

    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        Date localDateTime = new Date();
        System.out.println(localDateTime.getTime());
        System.out.println(l);

        System.out.println(System.getProperties());

        System.out.println(System.getProperty("os.name"));


        Map<String, String> getenv = System.getenv();
        System.out.println(getenv);
    }
}
