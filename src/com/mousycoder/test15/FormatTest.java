package com.mousycoder.test15;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/27 1:01 PM
 */
public class FormatTest {

    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);
        LocalDateTime changeDate = LocalDateTime.of(2022, 2, 28, 13, 12, 0);
        System.out.println(changeDate);
        Duration duration = Duration.between(today, changeDate);//第⼆个参数减第⼀ 个参数
        System.out.println(duration.toDays());//两个时间差的天数
        System.out.println(duration.toHours());//两个时间差的⼩时数
        System.out.println(duration.toMinutes());//两个时间差的分钟数
        System.out.println(duration.toMillis());//两个时间差的毫秒数
        System.out.println(duration.toNanos());//两个时间差的纳秒数
        Class<? extends LocalDateTime> aClass = today.getClass();


    }
}
