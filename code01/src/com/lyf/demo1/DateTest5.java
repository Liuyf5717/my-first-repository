package com.lyf.demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest5 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time = sdf.parse("2025-10-07 00:10:40");

        // 使用Calendar类设置为specificDate对应的日期
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(time);

        // 将hour of day, minute, second, and millisecond字段都设置为0
        // 表示时间的月份头一天
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        System.out.println(sdf.format(calendar.getTime()));
        calendar.set(Calendar.DAY_OF_MONTH, 0);


        Date firstDayOfMonth = calendar.getTime();

        // 输出结果
        System.out.println(sdf.format(firstDayOfMonth));

        System.out.println(firstDayOfMonth.getTime());

    }
}
