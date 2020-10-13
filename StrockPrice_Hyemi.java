class Solution2 {
		public int[] solution2(int[] prices) {
	        int[] answer = new int[prices.length];
	        int size=prices.length;
	        
	        for(int x=0; x<size-1; x++)
	        {
	        	answer[x]=0;
	        	for(int y=x+1; y<size; y++)
	        	{
	        		if(prices[x]<=prices[y]) answer[x]++;
	        		else {
	        			answer[x]++;
	        			break;
	        		}
	        	}
	        	
	        }
	        
	        return answer;
	    }
}


public class StrockPrice_Hyemi {
	
	public static void main(String[] args) {
		
		Solution2 s=new Solution2();
		int[] input= {1,2,3,2,3};
		int[] output=s.solution2(input);
		
		for(int x=0; x<output.length; x++)
		{
			System.out.print(output[x]);
		}

	}

}
