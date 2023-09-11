package StriverSDESheet.Sorting;

import java.util.Arrays;

public class BubbelSort {
    public static void main(String[] args) {
        System.out.println("Hello World");
		int[] arr={1,4,3,5,2};
		System.out.println(Arrays.toString(arr));
		Bubbel(arr);
		System.out.println(Arrays.toString(arr));
    }

    private static void Bubbel(int[] arr) {
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    swap(arr, j, j+1);
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
