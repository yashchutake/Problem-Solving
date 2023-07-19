package HundreadQChallenge.Arrays;

import java.lang.reflect.Array;
import java.util.*;

public class MoveZeros {
    public static void main(String[] args) {
        int[] a = { 0, 1, 0, 3, 12 };
        moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }

    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                if (nums[j] == 0) {
                    swap(nums, i, j);
                }
                j++;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // public static void moveZeroes1(int[] nums) {
    //     int n = nums.length;
    //     int ballSize = 0;
    //     for (int i = 0; i < n; i++) {
    //         if (nums[i] == 0) {
    //             ballSize++;
    //         } else if (ballSize > 0) {// only after geting the +ve number swap
    //             int t = nums[i];
    //             nums[i] = 0;
    //             nums[i - ballSize] = t;
    //         }
    //     }
    // }




}
