import java.util.*;

class Solution2{
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        for(int y=3; y<=brown; y++)
        {
        	double x=(brown+yellow)/y;
        	if(x-(int)x==0.0){
        		if(yellow==(int)(x-2)*(y-2)){
        			answer[0]=(int)x;
        			answer[1]=y;
        	        return answer;
        		}
        	}
        }
        return answer;
    }
}
public class Carpet_Hyemi {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		int brown=scan.nextInt();
		int yellow=scan.nextInt();

		Solution2 s=new Solution2();
		int[] answer=s.solution(brown, yellow);
		for(int x=0; x<answer.length; x++)
		System.out.print(answer[x]+" ");

	}

}
