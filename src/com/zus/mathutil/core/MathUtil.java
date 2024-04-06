package com.zus.mathutil.core;

/**
 *
 * @author hoang
 */
public class MathUtil {
    
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. N must be"
                    + "between 0..20");
        
        if (n == 0 || n == 1)
            return 1;
        
        long product = 1;
        
        for (int i = 2; i <= n; i++)
            product *= i;
        
        return product;
    }
    
}
