import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] a={1,2,3,0,0,0};
        int[] b={2,5,6};
        merge(a,3,b,3);
        System.out.println(Arrays.toString(a));
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1; //final one
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;            
            }
            else{
                nums1[k]=nums2[j];
                k--;
                j--; 
            }
        }
        while(i>=0){
            nums1[k]=nums1[i];
            k--;
            i--;
        }
        while(j>=0){
            nums1[k]=nums2[j];
            k--;
            j--;
        }
    }


}
