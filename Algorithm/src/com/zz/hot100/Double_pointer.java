package com.zz.hot100;

import java.util.Arrays;

public class Double_pointer {

    public static void main(String[] args) {
        int[] contoinsZeroarr = {0,1,0,3,12};
        moveZero(contoinsZeroarr);
        Arrays.stream(contoinsZeroarr).forEach(System.out::print);
    }


/**
 *  283移动0   https://leetcode.cn/problems/move-zeroes/description/?envType=study-plan-v2&envId=top-100-liked
 *  给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * 示例 1:
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 示例 2:
 * 输入: nums = [0]
 * 输出: [0]
 * 提示:
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 */

public static void moveZero(int[] nums){
    if (null == nums) return;
    //第一次遍历，j指针记录非0的个数，只要是非0的统统赋值num[j]
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            nums[j++] = nums[i];
        }
    }
    //非0元素统计完了，剩下的都是0了
    //第二次遍历把末尾的元素都赋值为0即可
    for (int i = j; i <nums.length; i++) {
        nums[i]=0;
    }
}
}
