package com.zz.hot100;

import java.util.HashSet;

public class Side_window {


    /**
     * 3.无重复字符最长字串  https://leetcode.cn/problems/longest-substring-without-repeating-characters/description/?envType=study-plan-v2&envId=top-100-liked
     * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
     * 示例 1:
     * <p>
     * 输入: s = "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     * 示例 2:
     * <p>
     * 输入: s = "bbbbb"
     * 输出: 1
     * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     * 示例 3:
     * <p>
     * 输入: s = "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     * <p>
     * <p>
     * 提示：
     * 0 <= s.length <= 5 * 104
     * s 由英文字母、数字、符号和空格组成
     */

    public int lengthofLongestSubstring(String s) {
        //hash集合记录每个字符串是否出现过
        HashSet<Character> set = new HashSet<>();
        int r = 0;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            //除了第一次，每次判断set包含重复字符串，做指针向右移动一位，移除重复元素
            if (i != 0) {
                set.remove(s.charAt(i - 1));
            }
            while (r < s.length() && !set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                ++r;
            }
            res = Math.max(res, r - i);
        }
        return res;
    }
}
