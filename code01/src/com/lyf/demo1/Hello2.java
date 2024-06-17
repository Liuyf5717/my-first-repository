package com.lyf.demo1;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static java.util.regex.Pattern.matches;

public class Hello2 {
    public static int i = 0;
    public static void main(String[] args) {
        for(int j = 0; j < 20; j++) {
            try{
                i++;
                test();

                System.out.println(i);
            }catch (Exception e){
                System.out.println("异常了");
            }

        }
    }

    public static void test() {
        if( i == 10){
            int x = 1/0 ;
        }
    }



}
