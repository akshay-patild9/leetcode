package leetCode;

public class FileSystemCrawl {

	public static void main(String[] args) {
		
		String [] logs = {"./","../","./"};
		//String [] logs = {"d1/","d2/","../","d21/","./"};
		//String [] logs = {"d1/","../","../","../"};
		//String [] logs = {"d1/","d2/","./","d3/","../","d31/"};
		
		int ans = minOps(logs);
		
		System.out.println(ans);

	}

	private static int minOps(String[] logs) {
		int n = 0;
		for(int i = 0; i< logs.length; i++)
		{
			
			if(logs[i].equals("../"))
			{
				if(n!=0)
				  n--;
			}
			else if(logs[i].equals("./"))
			{
				System.out.println(logs[i]);
				continue;
			}
			else
			{
				System.out.println("asd");
				n++;	
			}
		}
		return n;
	}

}
