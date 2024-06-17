package com.lyf.demo2;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set set =  new HashSet();
        set.add("我是好人");
        set.add("我是好人");
        set.add("我是");

        set.add("好人");
        System.out.println(set);
        System.out.println(set.size());
    }
}
