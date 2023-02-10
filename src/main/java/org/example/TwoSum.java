package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] intArr = {11, 15, 7, 3};
        System.out.println(Arrays.toString(twoSum(intArr, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                return new int[] {hm.get(nums[i]), i};
            } else {
                // find the first element
                hm.put(target - nums[i], i);
            }
        }
        return new int[] {0,0};
    }
}
