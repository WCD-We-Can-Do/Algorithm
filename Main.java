class Solution1 {
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        for(int y=0; y<phone_book.length; y++)
        {
        	String head=phone_book[y];
        	for(int x=0; x<phone_book.length; x++)
        	{
        		if(x!=y) {
        			if(head.length()<=phone_book[x].length()){
        				String now=phone_book[x].substring(0, head.length());
        				if(head.equals(now)) {
        					answer=false;
        					break;
        				}
        			}
        		}
        	}
        	
        	if(answer==false) break;
		}
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		
		String[] test1={"119","9489298","1193458"};
		String[] test2= {"12","123","1235","567","88"};
		
		Solution1 s=new Solution1();
		
		boolean test1_answer=s.solution(test1);
		boolean test2_answer=s.solution(test2);
		
		System.out.println(test1_answer);
		System.out.println(test2_answer);

	}

}
