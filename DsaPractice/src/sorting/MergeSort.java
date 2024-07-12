package sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {5,3,4,2,1};
		 arr = sort(arr);
		 System.out.println(Arrays.toString(arr));

	}

	private static int[] sort(int[] arr) {
		
		//System.out.println("arr "+Arrays.toString(arr));
		
		if(arr.length == 1)
			return arr;
		
		int mid = arr.length/2;
			
		int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(left, right);		
	}

	private static int[] merge(int[] first, int[] second) {
		
		//System.out.println("first "+ Arrays.toString(first));
		//System.out.println("second "+Arrays.toString(second));
		int i = 0;
		int j = 0;
		int k = 0;
		
		int mix[] = new int[first.length + second.length];
		
		while(i < first.length && j < second.length)
		{
			if(first[i] < second[j])
			{
				mix[k] = first[i];
				i++;
			}
			else
			{
				mix[k] = second[j];
				j++;
			}
			k++;
		}
		
		while(i<first.length)
		{
			mix[k] = first[i];
			i++;
		}
		
		while(j<second.length)
		{
			mix[k] = second[j];
			j++;
		}
		//System.out.println("mix "+ Arrays.toString(mix));
		return mix;
	}
	
	

}
