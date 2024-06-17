package com.lyf.demo1;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        Long l1 = 10000L;
        Long l2 = 123L;
        BigDecimal b1 = BigDecimal.valueOf(l1);
        BigDecimal b2 = BigDecimal.valueOf(l2);
        BigDecimal b3 = b1.add(b2);
        BigDecimal b4 = b1.divide(b3, 2, BigDecimal.ROUND_HALF_UP);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println((b4.multiply(BigDecimal.valueOf(100)) +"").substring(0, 2) +"%");

        Long l3 = l1 + l2;
        //BigDecimal b5 = l1;
    }
}
