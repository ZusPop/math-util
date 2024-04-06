package com.zus.mathutil.test.core;

import com.zus.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author hoang
 */

@RunWith(value = Parameterized.class)
public class MathUtilTestDDTTest {
        
        @Parameterized.Parameters
        public static Object[][] initData() {
            return new Integer[][] {
                                                 {0, 1},
                                                 {1, 1},
                                                 {2, 2},
                                                 {3, 6},
                                                 {4, 24},
                                                 {5, 120},
                                                };
        }
        
        @Parameterized.Parameter(value = 0)
        public int n;
        
        @Parameterized.Parameter(value = 1)
        public long expected;
        
        @Test
        public void testGetFactorialGivenRightArgumentReturnsWell() {
            Assert.assertEquals(expected, MathUtil.getFactorial(n));
        }
}
