package leetCode;

public class ChefCustomerAvgTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] arr = {{5,2},{5,4},{10,3},{20,1}};
		
		//{{5,2},{5,4},{10,3},{20,1}}
		double avg = getAvg(arr);
		System.out.println(avg);
	}

	private static double getAvg(int[][] arr) {
		long sum = 0;
		int prepStart = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			
			    //prepStart = prepStart + arr[i][0];
            	int arrival = arr[i][0];
            	int prepTime = arr[i][1];
            	
            	if(prepStart < arrival)
            	{
            		prepStart = arrival;
            	}
            		prepStart = prepStart + prepTime;
            	
            	long wait = prepStart - arrival;
            	System.out.println(prepStart+"-"+wait);

            	sum = sum + wait;
        }

		return (double)sum/arr.length;
	}
	
	

}
