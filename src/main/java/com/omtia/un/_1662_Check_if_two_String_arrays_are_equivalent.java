/*
 * @author Andrei Constantin Tanasache, act@omtia.com
 */

package com.omtia.un;

import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false
 * otherwise.
 *
 * A string is represented by an array if the array elements concatenated in order forms the string.
 *
 *
 *
 * Example 1:
 *
 * Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
 * Output: true
 * Explanation:
 * word1 represents string "ab" + "c" -> "abc"
 * word2 represents string "a" + "bc" -> "abc"
 * The strings are the same, so return true.
 * Example 2:
 *
 * Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
 * Output: false
 * Example 3:
 *
 * Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
 * Output: true
 *
 *
 * Constraints:
 *
 * 1 <= word1.length, word2.length <= 103
 * 1 <= word1[i].length, word2[i].length <= 103
 * 1 <= sum(word1[i].length), sum(word2[i].length) <= 103
 * word1[i] and word2[i] consist of lowercase letters.
 */
public class _1662_Check_if_two_String_arrays_are_equivalent {
    public static void main(String[] args) {
        Assert.assertEquals(arrayStringsAreEqual(new String[] {"te", "s", "t"}, new String[]{"t", "est"}), true);
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // O(w1 + w2)
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(int i = 0; i < word1.length; ++i) {
            sb1.append(word1[i]);
        }

        for(int j = 0; j < word2.length; ++j) {
            sb2.append(word2[j]);
        }

        return sb1.toString().equals(sb2.toString());
    }
}
