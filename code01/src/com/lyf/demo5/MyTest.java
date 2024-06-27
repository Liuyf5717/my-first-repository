package com.lyf.demo5;

public class MyTest {
    public static void main(String[] args) {
        // 准备
        Zi z1 = new Zi(10, "lyf");
        Zi z2 = new Zi(20, "ggg");
        Fu fu = new Fu();
        fu.setZ1(z1);
        fu.setZ2(z2);
        // 测试
        Zi z11 = fu.getZ1();
        z11.setName("HHHH");
        System.out.println(fu.getZ1().getName());


    }
}
