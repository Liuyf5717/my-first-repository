package com.lyf.demo1;

public class StringTest01 {
    public static void main(String[] args) {
        String s = "a\\b\\testfile/1.pdf";
        String replace = s.replace("\\", "/");
        System.out.println(replace);
    }
}
