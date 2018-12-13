package com.joseph;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wang qiang
 * @description
 * @date 15:38 2018/12/13
 **/

public class TwoSumTest {

    @Test
    public void twoSum() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] actuals = TwoSum.twoSum(nums, target);
        int[] expects = {1, 2};
        Assert.assertArrayEquals(expects, actuals);
    }
}
