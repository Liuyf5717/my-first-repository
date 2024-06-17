package com.lyf.demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest3 {
    public static void main(String[] args) throws ParseException {
        //Date gmtEnabled = new Date("yyyy-MM-dd HH:mm:ss");
        String gmtEnabled = "2024-03-01 11:11:11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf.parse(gmtEnabled);
        System.out.println(parse);

        int tag = 1;
        String s1 = "aaa";
        String s2 = "bbb";
        if (tag == 1 && s1.equals("aaa"));
        else if (tag == 2 && s2.equals("aaa"));
        else {
            System.out.println("全都没通过");
        }
    }
}

