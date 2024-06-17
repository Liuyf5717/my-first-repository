package com.lyf.demo1;

public class Hello3 {
    public static void main(String[] args) {
        String s = "liu60211163.com";
       // System.out.println(s.matches("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(.[a-zA-Z0-9_-]+)+$"));
        if(!s.matches("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(.[a-zA-Z0-9_-]+)+$")){
            System.out.println("格式错误");
        }
    }
}
