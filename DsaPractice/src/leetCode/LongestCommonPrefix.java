package leetCode;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] arr = {"flower","flo","float","floght"};
		String ans = findLongest(arr);
		System.out.println(ans);
	}

	private static String findLongest(String[] arr) {
		
		if(arr == null || arr.length == 0)
			return "";
		
		String prefix = arr[0];
		for(int i = 1; i<arr.length;i++)
		{
			while(arr[i].indexOf(prefix) != 0)
			{
				prefix = prefix.substring(0, prefix.length()-1);
				
				if(prefix.isEmpty())
					return "";
			}
		}
		return prefix;
	}
}
