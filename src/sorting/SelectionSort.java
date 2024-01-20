package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] nums= {2,4,3,6,7};
		selectionSort(nums);
		
		System.out.println(Arrays.toString(nums));

	}

	public static void selectionSort(int[] nums) {
		
		int minIndex=-1;
		int n=nums.length;
		
		for(int i=0;i<n-1;i++) {
			minIndex=i;
			for(int j=i;j<n;j++) {
				if(nums[minIndex]>nums[j]) {
					minIndex=j;
				}
			}
			
			int temp=nums[minIndex];
			nums[minIndex]=nums[i];
			nums[i]=temp;
		}
		
	}

}
