
public class ReverseRecurssion {

	public static void main(String[] args) {
		int num = 1362;
		reverse(num, 0);

	}

	private static void reverse(int num, int sum) {
		
		sum = sum*10 + num%10;
		
		if(num/10 > 0)
			reverse(num/10, sum);
		else
			System.out.println(sum);
	}

}
