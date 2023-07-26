package HundreadQChallenge.Arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={3,2,4};
        int[] ans =twoSum2(arr,6);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum2(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ans={0,0};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j] <=target) {
                    ans=new int[]{i,j};
                }
            }
        }
        return ans;
    }
}
