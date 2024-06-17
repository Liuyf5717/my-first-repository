package com.lyf.demo4;

public class RegexTest03 {
    public static void main(String[] args) {
        String nameRegex = "\\w{4,16}";
        String telRegex = "1[3-9]\\d{9}";
        String s = telRegex + "|" + nameRegex ;
        System.out.println(s);
        //System.out.println("lyf5717".matches(nameRegex));
        System.out.println("13766635999".matches(nameRegex));
        System.out.println("13766635999".matches(telRegex));
        System.out.println("13766635999".matches("(1[3-9]\\d{9})&&(\\w{4,16})"));

        String str = "h";
        //1.要求字符串是小写辅音字符开头，后跟ad
        String regex = "[a-z&&[^aeiou]]";
        //System.out.println("1." + str.matches(regex));
    }
}
