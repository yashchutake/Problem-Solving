package Arrayss;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class NextPermutation {
    public static void main(String[] args) {
        int arr[]={1,3,2};
        nextPermutation(arr);
    }
    // public static void nextPermutation(int[] nums) {
    //     int ind=-1,ind2=-1;
    //     int n=nums.length;
    //     //1 find break point
    //     for(int i=n-2;i>=0;i--){
    //         if(nums[i]<nums[i+1]){
    //             ind=i;break;
    //         }
    //     }

    //     // no breaking point 
    //     if(ind==-1){ //Edge case
    //             reverse(nums,0);
    //     }
    //     else{
    //        //2 just smaller 
    //         for (int i =n-1; i > ind; i--) { //just smaller
    //         if(nums[i]>nums[ind]){
    //             ind2=i;break;
    //         }
    //         swap(nums,ind,ind2);
    //         // step 3 reverse the rest right half
    //         reverse(nums,ind+1);
    //     }
    //     }
        
    // }
   
   
    public static void nextPermutation(int[] nums) {
             int ind=-1,ind2=-1;
        int n=nums.length;
        //1 find break point
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;break;
            }
        }
        if(ind==-1){ //Edge case
                reverse(nums,0);
        }

        //2
         for (int i =n-1; i > ind; i--) { //just smaller
            if(nums[i]>nums[ind]){
                swap(nums,ind,ind2);;break;
            }
          
            // step 3 reverse the rest right half
            reverse(nums,ind+1);

        }

    }
    private static void reverse(int[] nums, int start) {
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public static void swap(int[] nums,int i,int ind) {
        int temp=i;
        i=ind;
        ind=temp;
    }
}







