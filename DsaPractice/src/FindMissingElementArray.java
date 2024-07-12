import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingElementArray {

	public static void main(String[] args) {

       int[] nums = {8,4,5,4,2,1,6,3,7};
       List ans = sort(nums);
       System.out.println(ans);
	}
	
	static List<Integer> sort(int[] arr)
	{
		int i=0;
		
		while(i<arr.length)
		{
			int correct = arr[i] - 1;
			if(arr[i] != arr[correct])
			{
				swap(arr, i, correct);
			}
			else
				i++;
		}
		List<Integer> list = new ArrayList<>();
		
		System.out.println(Arrays.toString(arr));
		
		for(int j = 0; j < arr.length; j++)
		{
			if(arr[j] != (j+1))
			{
				list.add(arr[j]);
				list.add(j+1);
			}
		}
		return list;
	}

	private static void swap(int[] arr, int i, int correct) {
		
		int temp = arr[i];
		arr[i] = arr[correct];
		arr[correct] = temp;
	}

}
