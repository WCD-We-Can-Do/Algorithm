import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] result = new int[2];
        int sum = (brown + 4) / 2; // 가로와 세로의 합.
        int x = 3; // 세로
        int y = sum - x; // 가로
        
        // 노란색 칸이 최소 1개 y >= 3
        // 가로 >= 세로
        while(y >= 3 && y >= x) {
            // (가로 - 2) * (세로 - 2) == 노란색 칸의 개수
            if((y - 2) * (x - 2) == yellow){
                result[0] = y;
                result[1] = x;  
            }  
            y--; x++;
        }
        return result;
    }
}
