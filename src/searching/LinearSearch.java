package searching;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] nums= {1,2,3,4,5};
		
		int target=4;
		
		
		int index=linearSearch(nums,target);
		
		if(index!=-1) {
			System.out.println("Element found at index : "+index);
		}
		
		else {
			System.out.println("Element not found");
		}	

	}

	private static int linearSearch(int[] nums, int target) {
		
		for(int i=0;i<nums.length;i++){
			
			if(nums[i]==target) {
				return i;
			}	
		}
		return -1;
	}	

}
