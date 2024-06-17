package com.lyf.demo1;


import java.util.Calendar;

public class DateTest2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        long startTimeOfDay = calendar.getTimeInMillis();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        System.out.println(calendar.getTime());
        long endTimeOfDay = calendar.getTimeInMillis();

        System.out.println("零点时间戳: " + startTimeOfDay);
        System.out.println(endTimeOfDay);
    }
}
