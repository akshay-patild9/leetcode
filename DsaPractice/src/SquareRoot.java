
public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 40;
		double sqrt = sqrt(n);
		System.out.println(sqrt);
	}

	private static double sqrt(int n) {

		int start = 0;
		int end = n;
		double root = 0;
		int mid = 0;
        while(start<end)
        {
        	mid = start + (end-start)/2;
        	
        	if(mid*mid == n)
        		return mid;
        	
        	if(mid*mid >n)
        		end = mid-1;
        	if(mid*mid < n)
        		start = mid+1;
        }
        
        root = end;
        System.out.println(root+" "+n);
        double incr = 0.1;
        for(int i = 0; i< 3; i++)
        {
        	while(root*root <= n)
        	{
        		root+=incr;
        	}
        	root-=incr;
        	incr = incr/10;
        }
        
        //root = mid;
        	
		return root;
	}
	
	

}
