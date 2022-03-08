package com.mousycoder.test15;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/27 12:18 PM
 */
public class Main {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("今天⽇期：" + today); //获取年，⽉，⽇，周⼏

        System.out.println("现在是哪年:" + today.getYear());

        System.out.println("现在是哪⽉:" + today.getMonth());

        System.out.println("现在是哪⽉(数字):" + today.getMonthValue());

        System.out.println("现在是⼏号:" + today.getDayOfMonth());

        System.out.println("现在是周⼏:" + today.getDayOfWeek());

//加减年份, 加后返回的对象才是修改后的， 旧的依旧是旧的
        LocalDate changeDate = today.plusYears(1);

        System.out.println("加后是哪年:" + changeDate.getYear());

        System.out.println("旧的是哪年:" + today.getYear());

//⽇期⽐较
        System.out.println("isAfter: " + changeDate.isAfter(today));

//getYear() int 获取当前⽇期的年份 //getMonth() Month 获取当前⽇期的⽉份对象 //getMonthValue() int 获取当前⽇期是第⼏⽉ //getDayOfWeek() DayOfWeek 表示该对象表示的⽇期是星期⼏ //getDayOfMonth() int 表示该对象表示的⽇期是这个⽉第⼏天 //getDayOfYear() int 表示该对象表示的⽇期是今年第⼏天 //withYear(int year) LocalDate 修改当前对象的年份 //withMonth(int month) LocalDate 修改当前对象的⽉份 //withDayOfMonth(int dayOfMonth) LocalDate 修改当前对象在当⽉的⽇期 //plusYears(long yearsToAdd) LocalDate 当前对象增加指定的年份数 //plusMonths(long monthsToAdd) LocalDate 当前对象增加指定的⽉份数 //plusWeeks(long weeksToAdd) LocalDate 当前对象增加指定的周数 //plusDays(long daysToAdd) LocalDate 当前对象增加指定的天数 //minusYears(long yearsToSubtract) LocalDate 当前对象减去指定的年数 //minusMonths(long monthsToSubtract) LocalDate 当前对象减去注定的⽉数 //minusWeeks(long weeksToSubtract) LocalDate 当前对象减去指定的周数 //minusDays(long daysToSubtract) LocalDate 当前对象减去指定的天数 //compareTo(ChronoLocalDate other) int ⽐较当前对象和other对象在时 间上的⼤⼩，返回值如果为正，则当前对象时间较晚， //isBefore(ChronoLocalDate other) boolean ⽐较当前对象⽇期是否在 other对象⽇期之前 //isAfter(ChronoLocalDate other) boolean ⽐较当前对象⽇期是否在 other对象⽇期之后 //isEqual(ChronoLocalDate other) boolean ⽐较两个⽇期对象是否相等


    }
}
