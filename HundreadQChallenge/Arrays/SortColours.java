package HundreadQChallenge.Arrays;

import java.util.Arrays;

public class SortColours {
    public static void main(String[] args) {
        int[] arr={1,1,0,2};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
      public static void sortColors(int[] nums) {
       
        int start=0;
        int end=nums.length-1;
        int mid=0;

        while (mid<=end) {
            switch (nums[mid]) {
                case 0: 
                //swap with start index
                swap(nums,mid,start);
                start++;
                mid++;            
                break;
        
               case 1:
                //Ignore 
                mid++;
                break;
            
               case 2:
                //swap with end
                swap(nums,mid,end);
                end--;
                //mid++;  
                break;

                    
            }
        }
        
        
    }

     static void swap(int[] nums, int p1, int p2) {
           int temp=nums[p1];
           nums[p1]=nums[p2];
           nums[p2]=temp;
    }
}
