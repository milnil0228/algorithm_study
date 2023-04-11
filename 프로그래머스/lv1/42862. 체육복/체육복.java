import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] total = new int[n + 2];
        for (int i = 1; i < n + 1; i++) {
            total[i] = 1;
        }
        
        for (int l : lost) {
            total[l]--;
        }
        
        for (int r : reserve) {
            total[r]++;
        }
            
         for (int i = 1; i < n + 1; i++) {
            if (total[i] == 0) {
                if (total[i - 1] == 2) {
                    total[i - 1]--;
                    total[i]++;
                } else {
                    if (total[i + 1] == 2) {
                    total[i + 1]--;
                    total[i]++;
                    }
                }
            }
        }
        
        for (int t : total) {
            if (t > 0) {
                answer++;
            }
        }
        return answer;
    }
}