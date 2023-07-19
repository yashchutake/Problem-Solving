package HundreadQChallenge.Arrays;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] a={-1,1,0,-3,3};
        //{1,2,3,4};
        int[] result=productExceptSelf(a);
       // System.out.println(a.length);
        System.out.println(Arrays.toString(result));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int [] left=new int[nums.length];
        int [] right=new int[nums.length];
        
        left[0]=1;
        for (int i = 1; i < nums.length; i++) {
            left[i]=nums[i-1]*left[i-1];
        }

        right[n-1]=1;
        for (int i = nums.length-2; i >=0; i--) {
            right[i]=nums[i+1]*right[i+1];
        }

         int [] ans=new int[nums.length];
         for (int i = 0; i < nums.length; i++) {
            ans[i]=right[i]*left[i];
         }
        
       return ans;
    }
    
}


//    public static int[] productExceptSelf(int[] nums) {
//         int n=nums.length;
//         int [] nums2=new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             int total=1  ;  
//             for (int j = 0; j < nums.length; j++) {   
//                 if(i==j){
//                   continue;
//                 }
//                 total=total*nums[j];
//                 System.out.println("here");
//             }
//            nums2[i]=total;
//          ;
//     }
//     return nums2;
// }


