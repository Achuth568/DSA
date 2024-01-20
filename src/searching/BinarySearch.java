package searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6};
		int target=6;
		int index=binarySearch(nums,target);
		
		if(index!=-1) {
			System.out.println("Element found at index : "+index);
		}
		
		else {
			System.out.println("Element not found");
		}
		
		

	}

	public static int binarySearch(int[] nums, int target) {
		
		int left=0;
		int right=nums.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			
			if(nums[mid]==target) {
				return mid;
			}
			else if(nums[mid]>target) {
				right=mid-1;
				
			}
			else {
				left=mid+1;
				
			}
		}		
		return -1;
	}

}
