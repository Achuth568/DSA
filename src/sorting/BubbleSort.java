package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] nums= {2,3,1,4,7};
		
		bubblesort(nums);
		
		System.out.println(Arrays.toString(nums));

	}

	public static void bubblesort(int[] nums) {
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length-i-1;j++) {
				
				if(nums[j]>nums[j+1]) {
					
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
					
				}
			}
		}
		
	}

}
