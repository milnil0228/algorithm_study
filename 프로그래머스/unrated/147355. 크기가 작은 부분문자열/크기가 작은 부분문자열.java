import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int lenP = p.length();
        int lenT = t.length();
        for (int i = 0; i < lenT - lenP + 1; i++) {
            if (Long.parseLong(t.substring(i, i + lenP)) <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }
}