package com.lyf.demo1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = format.format(date);
        System.out.println(now);

        long l = System.currentTimeMillis();
        Date date1 = new Date(l);
        SimpleDateFormat format2 = new SimpleDateFormat("HH:mm");
        String now2 = format2.format(date1);
        System.out.println(now2);
    }
}
