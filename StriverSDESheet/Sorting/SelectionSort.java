package StriverSDESheet.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
		System.out.println("Hello World");
		int[] arr={1,4,3,5,2};
		System.out.println(Arrays.toString(arr));
		selection(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static void selection(int[] arr){
	    int n=arr.length;
	    for(int i=0;i<n-1;i++){
             int small=i;
	         for(int j=i+1;j<n;j++){
                if(arr[j]<arr[small]){
                    small=j;
                    swap(arr,small,i);
                }	        
	       }
	    }
	}

	public static void swap(int[] arr,int small,int i){
	    int temp=arr[small];
	    arr[small]=arr[i];
	    arr[i]=temp;
	} 
}
