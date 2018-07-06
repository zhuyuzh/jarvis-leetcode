package com.jarvis.leetcode.arrays;

/**
 * 删除排序数组中的重复项
 *
 * @author YU.ZHU
 * @project_name: jarvis-leetcode
 * @package: com.jarvis.leetcode.arrays
 * @create 2018-07-06 16:58
 */
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int j = 0;
        for(int i = 1; i < nums.length; i ++) {
            if (nums[i] != nums[j]) {
                j ++;
                nums[j] = nums[i];
            }
        }
        for (int m = 0; m < nums.length; m ++) {
            System.out.println(nums[m]);
        }
        return j + 1;
    }
}
