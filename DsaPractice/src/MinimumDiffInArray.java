import java.util.Arrays;

public class MinimumDiffInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,5,0,10,14};
		int[] sortedArr = sort(nums);
		
		System.out.println(findMinDiff(sortedArr));
		
		System.out.println(Arrays.toString(sortedArr));
	}
	
	private static int findMinDiff(int[] sortedArr) 
	{	
		int n = sortedArr.length;
        int minDiff = Integer.MAX_VALUE;
        
        for (int i = 0; i < 4; i++) {
            int j = n - 4 + i;
            minDiff = Math.min(minDiff, sortedArr[j] - sortedArr[i]);
        }
		return minDiff;
						
	}

	static int[] sort(int[] arr)
	{
		boolean swapped = false;
        for(int i = 0; i < arr.length; i++)
        {
        	for(int j = 1; j < arr.length-i; j++)
        	{
        		if(arr[j] < arr[j-1])
        		{
        			int temp = arr[j];
        			arr[j] = arr[j-1];
        			arr[j-1] = temp;
        			swapped = true;
        		}
        	}
        	if(!swapped)
        		break;
        }		
		return arr;		
	}
}
