package HundreadQChallenge.Arrays;
import java.util.*;
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        int ans =maxArea(arr);
        System.out.println(ans);
    }
    public static int maxArea(int[] height) {
        int maxArea=0;
        int left=0;
        int right=height.length-1;

        while (left<right) {
            //                    Height      *      Width
            int area=Math.min(height[left], height[right]) * (right-left);
            maxArea= Math.max(maxArea, area);
            if(height[left] < height[right]){
                left++; // age ane de
            }
            else{
                right--; //pichu se kam kar
            }
        }
        return maxArea;
    }
}
