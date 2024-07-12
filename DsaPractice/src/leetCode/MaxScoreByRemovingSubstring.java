package leetCode;

public class MaxScoreByRemovingSubstring {

	public static void main(String[] args) {
		String s = "cdbcbbaaabab";
		int x = 4, y = 5;
		int maxPoint = maximumGain(s,x,y);
		System.out.println(maxPoint);

	}

	public static int maximumGain(String s, int x, int y) {
		
		 if (x > y) {
	            return calculatePoints(s, "ab", x, "ba", y);
	        } else {
	            return calculatePoints(s, "ba", y, "ab", x);
	        }
		
	}
	
	private static int calculatePoints(String s, String firstPair, int firstPoints, String secondPair, int secondPoints) {
		int totalPoint = 0;
		String remaining = getPoint(s, firstPair, firstPoints, totalPoint);
        String finalRes =  getPoint(remaining.split("-")[0], secondPair, secondPoints, Integer.parseInt(remaining.split("-")[1]));
        return Integer.parseInt(finalRes.split("-")[1]);
    }

	private static String getPoint(String s, String subString, int point, int totalPoint) {
		StringBuilder builder = new StringBuilder();
		
		for(char ch : s.toCharArray())
		{
			if(builder.length() > 0 && subString.charAt(0) == builder.charAt(builder.length()-1) && ch ==  subString.charAt(1))
			{
				builder.deleteCharAt(builder.length()-1);
				totalPoint += point;
			}
			else
			{
				builder.append(ch);
			}
		}
		
		return builder.toString()+"-"+totalPoint;
		
	}

}
