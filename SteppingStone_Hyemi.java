import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

class Solution3 {
    public int solution(int distance, int[] rocks, int n) {
        int answer = 0;

        Arrays.sort(rocks);
        int left=0;
        int right=distance;
        int mid=0;

        while (left<=right){
        	mid=(left+right)/2;
        	int prv=0;
        	int removeCnt=0;

        	for(int i=0; i<rocks.length; i++){
        		if(rocks[i]-prv < mid){
        			removeCnt++;
        			if(removeCnt>n) break; //n개의 바위만을 지움.
        			}
        		else prv=rocks[i]; //그 다음 바위를 선택할 수 있도록.
        	}

            if(removeCnt>n) right=mid-1;
        	else answer=answer>mid? answer:mid; left=mid+1;
        }
        return answer;

    }
}
public class SteppingStone_Hyemi {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		int distance=scan.nextInt();
		String test=scan.nextLine();
		String rock_input=scan.nextLine();
		StringTokenizer st=new StringTokenizer(rock_input, ", ");
		int[] rocks=new int[st.countTokens()];

		for(int x=0; x<rocks.length; x++)
		{
			rocks[x]=Integer.parseInt(st.nextToken());
		}

		int remove_rock=scan.nextInt();

		Solution3 s=new Solution3();
		int answer=s.solution(distance, rocks, remove_rock);
		System.out.println(answer);

	}

}
