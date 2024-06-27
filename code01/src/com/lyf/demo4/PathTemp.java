package com.lyf.demo4;

public class PathTemp {
    public void aa(){
        String path = this.getClass().getResource("/").getPath();
        System.out.println(path);
    }
}
