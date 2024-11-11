package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution11Test {
    @Test
        /*
         * 测试传入的整数数组的元素个数少于3个的情况
         * 测试用例：{1，2}
         * */
    public void test1() {
        int[] nums = {1,2};
        Solution11 a = new Solution11();
        Assert.assertEquals(0,a.threeSum(nums).size());
    }

    @Test
        /*
         * 测试传入的整数数组元素全是正数的情况
         * 测试用例：{1，2，3}*/
    public void test2(){
        int[] nums = {1,2,3};
        Solution11 a = new Solution11();
        Assert.assertEquals(0,a.threeSum(nums).size());
    }

    @Test
        /*
         * 测试传入的整数数组元素全是负数的情况
         * 测试用例：{-1，-2，-3}*/
    public void test3(){
        int[] nums = {-1,-2,-3};
        Solution11 a = new Solution11();
        Assert.assertEquals(0,a.threeSum(nums).size());
    }

    @Test
        /*
         * 测试传入的整数数组元素全是0的情况
         * 测试用例：{0，0，0，0}*/
    public void test4(){
        int[] nums = {0,0,0,0};
        Solution11 a = new Solution11();
        Assert.assertEquals(1,a.threeSum(nums).size());
    }

    @Test
        /*
         * 测试传入的整数数组元素有正有负的情况
         * 测试用例：{1，-1，0，2，-1}*/
    public void test5(){
        int[] nums = {1,-1,0,2,-1};
        Solution11 a = new Solution11();
        Assert.assertEquals(2,a.threeSum(nums).size());
    }

}