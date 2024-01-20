package sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int[] arr = { 3, 5, 2, 7, 6, 9 };
		int left = 0;
		int right = arr.length;

		mergeSort(arr, left, right);
		System.out.println(Arrays.toString(arr));

	}

	private static void mergeSort(int[] arr, int left, int right) {

		if (left < right) {

			int mid = left + (right - left) / 2;

			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);

			merge(arr, left, mid, right);

		}

	}

	private static void merge(int[] arr, int left, int mid, int right) {
		
		int n1=mid-left+1;
		int n2=right-mid;
		
		
		int[] leftArray=new int[n1];
		int[] rigthArray=new int[n2];

	}

}
