/*
 * @author Andrei Constantin Tanasache, act@omtia.com
 */

package com.omtia.un;

import java.util.Arrays;

/**
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number
 * of 1's in the binary representation of i.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2
 * Output: [0,1,1]
 * Explanation:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * Example 2:
 *
 * Input: n = 5
 * Output: [0,1,1,2,1,2]
 * Explanation:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * 3 --> 11
 * 4 --> 100
 * 5 --> 101
 *
 *
 * Constraints:
 *
 * 0 <= n <= 105
 *
 *
 * Follow up:
 *
 * It is very easy to come up with a solution with a runtime of O(n log n). Can you do it in linear time O(n) and
 * possibly in a single pass?
 * Can you do it without using any built-in function (i.e., like __builtin_popcount in C++)?
 */

public class _338_Counting_Bits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
        System.out.println(Arrays.toString(countBits2(5)));
    }

    public static int[] countBits(int n) {
        int[] sol = new int[n+1];

        for(int i = 0; i <= n; i++) {
            for(int j = 0; j < 64; j++) {
                if((i& (1L<<j)) > 0) sol[i] ++;
            }
        }

        return sol;
    }

    public static int[] countBits2(int n) {
        int[] sol = new int[n+1];

        for(int i = 0; i <= n; i++) {
            sol[i] = Integer.bitCount(i);
        }

        return sol;
    }
}
