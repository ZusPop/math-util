package com.zus.mathutil.main;

import com.zus.mathutil.core.MathUtil;

/**
 *
 * @author hoang
 */
public class Main {
    public static void main(String[] args) {
        long expected = 120;
        int n = 5;
        
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual + " actual");
    }
}
