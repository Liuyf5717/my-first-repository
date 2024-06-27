package com.lyf.demo4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class OtherTest {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("aa");
        objects.add("a");
        objects.add("a");
        objects.add("b");
        objects.add("c");
        objects.add("a");
        int i = objects.indexOf("a");
        System.out.println(i);

        LinkedList<Integer> removeIndexList = new LinkedList<>();
        removeIndexList.add(0,1);
        removeIndexList.add(0,2);
        removeIndexList.add(0,3);
        removeIndexList.add(0,4);
        System.out.println(removeIndexList);
    }
}
