
public class FindElementInMountainArray {

	public static void main(String[] args) {
	
		int arr[] = {2,4,7,13,17,12,9,7,4,1};
        int target = 12;
        
        int index = search(arr, target);
        System.out.println(index);
	}

	private static int search(int[] arr, int target) {
		int ans = -1;
		//find peak
		int peak = -1;
		int start = 0;
		int end = arr.length-1;
		
		while(start<end)
		{
			int mid = start + (end-start)/2;
			
			if(arr[mid] < arr[mid+1]) // asc part
				start = mid+1;
			else if(arr[mid] > arr[mid+1])
				end = mid;
		}
		
	   ans = searchBinary(target, arr, 0, start); //binary search in asc part
	   if(ans == -1) 
		ans = searchBinary(target, arr, start, arr.length-1); //binary search in desc part
		
	   return ans;
	}

	private static int searchBinary(int target, int[] arr, int start, int end) {
		int index = -1;
				
		while(start<=end)
		{
			int mid = start + (end-start)/2;
			if(arr[mid] == target)
				return mid;
			
			boolean isAsc = arr[start] < arr[end];
			
			if(isAsc)
			{
				if(arr[mid]> target)
					end = mid-1;
				else
					start = mid+1;
					
			}
			else
			{
				if(arr[mid]< target)
					end = mid-1;
				else
					start = mid+1;
			}
		}
		
		return index;		
	}

}
