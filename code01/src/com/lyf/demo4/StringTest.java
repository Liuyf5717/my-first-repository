package com.lyf.demo4;

public class StringTest {
    public static void main(String[] args) {
        String s = "批量新增用户模板.xls.x";
        String substring = s.substring(0, s.lastIndexOf("."));
        System.out.println(substring);
    }
}
