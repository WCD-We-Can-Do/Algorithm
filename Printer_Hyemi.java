import java.util.LinkedList;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        int size=priorities.length;
        
        LinkedList<Integer> q=new LinkedList<Integer>();
        
        for(int x=0; x<size; x++)
        {
        	q.add(priorities[x]);
        }
        
        int now_index=location;
        while(!q.isEmpty())
        {
        	size=q.size();
        	int now=0;
        	for(int x=0; x<size; x++)
        	{
        		if(q.get(0)<q.get(x)) {
        			q.add(q.get(0));
        			q.pop();
        			now=1;
        			if(now_index-1<0) now_index=q.size()-1;
        			else now_index--;
        			break;
        		}
        	}
        	if(now==0) {
        		q.pop();
        		answer++;
    			if(now_index==0) break;
    			else now_index--;
        	}
        	
        }
        
        return answer;
    }
}
public class Printer_Hyemi {

	public static void main(String[] args) {
		
		Solution s=new Solution();
		int[] priorities= {2,1,3,2};
		int location=2;
		
		int answer=s.solution(priorities, location);
		System.out.print(answer);
		
	}

}
