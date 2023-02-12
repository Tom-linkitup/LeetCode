package arraysandhashing;


import java.util.*;

/**
 * Input: nums = [1,2,3,4]
 * Left: 1 1 1*2 2*3
 * Right: 2*3*4 3*4 4 1
 * Output: Left * Right = [24,12,8,6]
 */
public class ProductExceptSelf {

    public static void main(String[] args) {
        int[] nums = {0,0};
        int[] nums2 = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
        System.out.println(Arrays.toString(productExceptSelf(nums2)));
    }

    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];
        // Calculate lefts and store in res.
        int left = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0)
                left = left * nums[i - 1];
            res[i] = left;
        }
        // Calculate rights and the product from the end of the array.
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1)
                right = right * nums[i + 1];
            res[i] *= right;
        }
        return res;
    }
}













//    int n = nums.length;
//    int[] res = new int[n];
//        res[0] = 1;
//                for (int i = 1; i < n; i++) {
//        res[i] = res[i - 1] * nums[i - 1];
//        }
//        int right = 1;
//        for (int i = n - 1; i >= 0; i--) {
//        res[i] *= right;
//        right *= nums[i];
//        }
//        return res;