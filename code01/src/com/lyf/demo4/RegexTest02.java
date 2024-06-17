package com.lyf.demo4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest02 {
    public static void main(String[] args) {
        String s = "GB1234567，，aaaa啊啊GB7654321";

        String regex = "GB\\d{7}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
