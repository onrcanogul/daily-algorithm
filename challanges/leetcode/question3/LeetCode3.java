package challanges.leetcode.question3;

import java.util.*;

public class LeetCode3 {
    /*
    Given a string s, find the length of the longest substring without duplicate characters.
    Example 1:
    Input: s = "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

    Example 2:
    Input: s = "bbbbb"
    Output: 1
    Explanation: The answer is "b", with the length of 1.

    Example 3:
    Input: s = "pwwkew"
    Output: 3
    Explanation: The answer is "wke", with the length of 3.
    Notice that the answer must be a substring, "pwke" is a subsequence and not a substring. */
    public static int lengthOfLongestSubstring(String s) {
        String word = "";
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (word.contains(String.valueOf(c))) {
                int index = word.indexOf(c);
                word = word.substring(index + 1);
            }
            word += c;
            maxLen = Math.max(maxLen, word.length());
        }

        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

}
